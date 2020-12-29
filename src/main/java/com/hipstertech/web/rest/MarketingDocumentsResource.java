package com.hipstertech.web.rest;

import com.hipstertech.service.MarketingDocumentsService;
import com.hipstertech.web.rest.errors.BadRequestAlertException;
import com.hipstertech.service.dto.MarketingDocumentsDTO;

import io.github.jhipster.web.util.HeaderUtil;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing {@link com.hipstertech.domain.MarketingDocuments}.
 */
@RestController
@RequestMapping("/api")
public class MarketingDocumentsResource {

    private final Logger log = LoggerFactory.getLogger(MarketingDocumentsResource.class);

    private static final String ENTITY_NAME = "marketingDocuments";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final MarketingDocumentsService marketingDocumentsService;

    public MarketingDocumentsResource(MarketingDocumentsService marketingDocumentsService) {
        this.marketingDocumentsService = marketingDocumentsService;
    }

    /**
     * {@code POST  /marketing-documents} : Create a new marketingDocuments.
     *
     * @param marketingDocumentsDTO the marketingDocumentsDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new marketingDocumentsDTO, or with status {@code 400 (Bad Request)} if the marketingDocuments has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/marketing-documents")
    public ResponseEntity<MarketingDocumentsDTO> createMarketingDocuments(@RequestBody MarketingDocumentsDTO marketingDocumentsDTO) throws URISyntaxException {
        log.debug("REST request to save MarketingDocuments : {}", marketingDocumentsDTO);
        if (marketingDocumentsDTO.getId() != null) {
            throw new BadRequestAlertException("A new marketingDocuments cannot already have an ID", ENTITY_NAME, "idexists");
        }
        MarketingDocumentsDTO result = marketingDocumentsService.save(marketingDocumentsDTO);
        return ResponseEntity.created(new URI("/api/marketing-documents/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, false, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /marketing-documents} : Updates an existing marketingDocuments.
     *
     * @param marketingDocumentsDTO the marketingDocumentsDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated marketingDocumentsDTO,
     * or with status {@code 400 (Bad Request)} if the marketingDocumentsDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the marketingDocumentsDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/marketing-documents")
    public ResponseEntity<MarketingDocumentsDTO> updateMarketingDocuments(@RequestBody MarketingDocumentsDTO marketingDocumentsDTO) throws URISyntaxException {
        log.debug("REST request to update MarketingDocuments : {}", marketingDocumentsDTO);
        if (marketingDocumentsDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        MarketingDocumentsDTO result = marketingDocumentsService.save(marketingDocumentsDTO);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, marketingDocumentsDTO.getId().toString()))
            .body(result);
    }

    /**
     * {@code GET  /marketing-documents} : get all the marketingDocuments.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of marketingDocuments in body.
     */
    @GetMapping("/marketing-documents")
    public List<MarketingDocumentsDTO> getAllMarketingDocuments() {
        log.debug("REST request to get all MarketingDocuments");
        return marketingDocumentsService.findAll();
    }

    /**
     * {@code GET  /marketing-documents/:id} : get the "id" marketingDocuments.
     *
     * @param id the id of the marketingDocumentsDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the marketingDocumentsDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/marketing-documents/{id}")
    public ResponseEntity<MarketingDocumentsDTO> getMarketingDocuments(@PathVariable Long id) {
        log.debug("REST request to get MarketingDocuments : {}", id);
        Optional<MarketingDocumentsDTO> marketingDocumentsDTO = marketingDocumentsService.findOne(id);
        return ResponseUtil.wrapOrNotFound(marketingDocumentsDTO);
    }

    /**
     * {@code DELETE  /marketing-documents/:id} : delete the "id" marketingDocuments.
     *
     * @param id the id of the marketingDocumentsDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/marketing-documents/{id}")
    public ResponseEntity<Void> deleteMarketingDocuments(@PathVariable Long id) {
        log.debug("REST request to delete MarketingDocuments : {}", id);
        marketingDocumentsService.delete(id);
        return ResponseEntity.noContent().headers(HeaderUtil.createEntityDeletionAlert(applicationName, false, ENTITY_NAME, id.toString())).build();
    }
}
