package com.hipstertech.web.rest;

import com.hipstertech.ProceesorsapApp;
import com.hipstertech.domain.MarketingDocuments;
import com.hipstertech.repository.MarketingDocumentsRepository;
import com.hipstertech.service.MarketingDocumentsService;
import com.hipstertech.service.dto.MarketingDocumentsDTO;
import com.hipstertech.service.mapper.MarketingDocumentsMapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.hipstertech.domain.enumeration.Status;
/**
 * Integration tests for the {@link MarketingDocumentsResource} REST controller.
 */
@SpringBootTest(classes = ProceesorsapApp.class)
@AutoConfigureMockMvc
@WithMockUser
public class MarketingDocumentsResourceIT {

    private static final Integer DEFAULT_DOC_NUMBER = 1;
    private static final Integer UPDATED_DOC_NUMBER = 2;

    private static final Status DEFAULT_STATUS = Status.PENDING;
    private static final Status UPDATED_STATUS = Status.PROCESSED;

    private static final String DEFAULT_COMMENTS = "AAAAAAAAAA";
    private static final String UPDATED_COMMENTS = "BBBBBBBBBB";

    private static final Instant DEFAULT_PROCESSED_DATE = Instant.ofEpochMilli(0L);
    private static final Instant UPDATED_PROCESSED_DATE = Instant.now().truncatedTo(ChronoUnit.MILLIS);

    @Autowired
    private MarketingDocumentsRepository marketingDocumentsRepository;

    @Autowired
    private MarketingDocumentsMapper marketingDocumentsMapper;

    @Autowired
    private MarketingDocumentsService marketingDocumentsService;

    @Autowired
    private EntityManager em;

    @Autowired
    private MockMvc restMarketingDocumentsMockMvc;

    private MarketingDocuments marketingDocuments;

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static MarketingDocuments createEntity(EntityManager em) {
        MarketingDocuments marketingDocuments = new MarketingDocuments()
            .docNumber(DEFAULT_DOC_NUMBER)
            .status(DEFAULT_STATUS)
            .comments(DEFAULT_COMMENTS)
            .processedDate(DEFAULT_PROCESSED_DATE);
        return marketingDocuments;
    }
    /**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static MarketingDocuments createUpdatedEntity(EntityManager em) {
        MarketingDocuments marketingDocuments = new MarketingDocuments()
            .docNumber(UPDATED_DOC_NUMBER)
            .status(UPDATED_STATUS)
            .comments(UPDATED_COMMENTS)
            .processedDate(UPDATED_PROCESSED_DATE);
        return marketingDocuments;
    }

    @BeforeEach
    public void initTest() {
        marketingDocuments = createEntity(em);
    }

    @Test
    @Transactional
    public void createMarketingDocuments() throws Exception {
        int databaseSizeBeforeCreate = marketingDocumentsRepository.findAll().size();
        // Create the MarketingDocuments
        MarketingDocumentsDTO marketingDocumentsDTO = marketingDocumentsMapper.toDto(marketingDocuments);
        restMarketingDocumentsMockMvc.perform(post("/api/marketing-documents")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(marketingDocumentsDTO)))
            .andExpect(status().isCreated());

        // Validate the MarketingDocuments in the database
        List<MarketingDocuments> marketingDocumentsList = marketingDocumentsRepository.findAll();
        assertThat(marketingDocumentsList).hasSize(databaseSizeBeforeCreate + 1);
        MarketingDocuments testMarketingDocuments = marketingDocumentsList.get(marketingDocumentsList.size() - 1);
        assertThat(testMarketingDocuments.getDocNumber()).isEqualTo(DEFAULT_DOC_NUMBER);
        assertThat(testMarketingDocuments.getStatus()).isEqualTo(DEFAULT_STATUS);
        assertThat(testMarketingDocuments.getComments()).isEqualTo(DEFAULT_COMMENTS);
        assertThat(testMarketingDocuments.getProcessedDate()).isEqualTo(DEFAULT_PROCESSED_DATE);
    }

    @Test
    @Transactional
    public void createMarketingDocumentsWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = marketingDocumentsRepository.findAll().size();

        // Create the MarketingDocuments with an existing ID
        marketingDocuments.setId(1L);
        MarketingDocumentsDTO marketingDocumentsDTO = marketingDocumentsMapper.toDto(marketingDocuments);

        // An entity with an existing ID cannot be created, so this API call must fail
        restMarketingDocumentsMockMvc.perform(post("/api/marketing-documents")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(marketingDocumentsDTO)))
            .andExpect(status().isBadRequest());

        // Validate the MarketingDocuments in the database
        List<MarketingDocuments> marketingDocumentsList = marketingDocumentsRepository.findAll();
        assertThat(marketingDocumentsList).hasSize(databaseSizeBeforeCreate);
    }


    @Test
    @Transactional
    public void getAllMarketingDocuments() throws Exception {
        // Initialize the database
        marketingDocumentsRepository.saveAndFlush(marketingDocuments);

        // Get all the marketingDocumentsList
        restMarketingDocumentsMockMvc.perform(get("/api/marketing-documents?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(marketingDocuments.getId().intValue())))
            .andExpect(jsonPath("$.[*].docNumber").value(hasItem(DEFAULT_DOC_NUMBER)))
            .andExpect(jsonPath("$.[*].status").value(hasItem(DEFAULT_STATUS.toString())))
            .andExpect(jsonPath("$.[*].comments").value(hasItem(DEFAULT_COMMENTS)))
            .andExpect(jsonPath("$.[*].processedDate").value(hasItem(DEFAULT_PROCESSED_DATE.toString())));
    }
    
    @Test
    @Transactional
    public void getMarketingDocuments() throws Exception {
        // Initialize the database
        marketingDocumentsRepository.saveAndFlush(marketingDocuments);

        // Get the marketingDocuments
        restMarketingDocumentsMockMvc.perform(get("/api/marketing-documents/{id}", marketingDocuments.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.id").value(marketingDocuments.getId().intValue()))
            .andExpect(jsonPath("$.docNumber").value(DEFAULT_DOC_NUMBER))
            .andExpect(jsonPath("$.status").value(DEFAULT_STATUS.toString()))
            .andExpect(jsonPath("$.comments").value(DEFAULT_COMMENTS))
            .andExpect(jsonPath("$.processedDate").value(DEFAULT_PROCESSED_DATE.toString()));
    }
    @Test
    @Transactional
    public void getNonExistingMarketingDocuments() throws Exception {
        // Get the marketingDocuments
        restMarketingDocumentsMockMvc.perform(get("/api/marketing-documents/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateMarketingDocuments() throws Exception {
        // Initialize the database
        marketingDocumentsRepository.saveAndFlush(marketingDocuments);

        int databaseSizeBeforeUpdate = marketingDocumentsRepository.findAll().size();

        // Update the marketingDocuments
        MarketingDocuments updatedMarketingDocuments = marketingDocumentsRepository.findById(marketingDocuments.getId()).get();
        // Disconnect from session so that the updates on updatedMarketingDocuments are not directly saved in db
        em.detach(updatedMarketingDocuments);
        updatedMarketingDocuments
            .docNumber(UPDATED_DOC_NUMBER)
            .status(UPDATED_STATUS)
            .comments(UPDATED_COMMENTS)
            .processedDate(UPDATED_PROCESSED_DATE);
        MarketingDocumentsDTO marketingDocumentsDTO = marketingDocumentsMapper.toDto(updatedMarketingDocuments);

        restMarketingDocumentsMockMvc.perform(put("/api/marketing-documents")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(marketingDocumentsDTO)))
            .andExpect(status().isOk());

        // Validate the MarketingDocuments in the database
        List<MarketingDocuments> marketingDocumentsList = marketingDocumentsRepository.findAll();
        assertThat(marketingDocumentsList).hasSize(databaseSizeBeforeUpdate);
        MarketingDocuments testMarketingDocuments = marketingDocumentsList.get(marketingDocumentsList.size() - 1);
        assertThat(testMarketingDocuments.getDocNumber()).isEqualTo(UPDATED_DOC_NUMBER);
        assertThat(testMarketingDocuments.getStatus()).isEqualTo(UPDATED_STATUS);
        assertThat(testMarketingDocuments.getComments()).isEqualTo(UPDATED_COMMENTS);
        assertThat(testMarketingDocuments.getProcessedDate()).isEqualTo(UPDATED_PROCESSED_DATE);
    }

    @Test
    @Transactional
    public void updateNonExistingMarketingDocuments() throws Exception {
        int databaseSizeBeforeUpdate = marketingDocumentsRepository.findAll().size();

        // Create the MarketingDocuments
        MarketingDocumentsDTO marketingDocumentsDTO = marketingDocumentsMapper.toDto(marketingDocuments);

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restMarketingDocumentsMockMvc.perform(put("/api/marketing-documents")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(marketingDocumentsDTO)))
            .andExpect(status().isBadRequest());

        // Validate the MarketingDocuments in the database
        List<MarketingDocuments> marketingDocumentsList = marketingDocumentsRepository.findAll();
        assertThat(marketingDocumentsList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteMarketingDocuments() throws Exception {
        // Initialize the database
        marketingDocumentsRepository.saveAndFlush(marketingDocuments);

        int databaseSizeBeforeDelete = marketingDocumentsRepository.findAll().size();

        // Delete the marketingDocuments
        restMarketingDocumentsMockMvc.perform(delete("/api/marketing-documents/{id}", marketingDocuments.getId())
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<MarketingDocuments> marketingDocumentsList = marketingDocumentsRepository.findAll();
        assertThat(marketingDocumentsList).hasSize(databaseSizeBeforeDelete - 1);
    }
}
