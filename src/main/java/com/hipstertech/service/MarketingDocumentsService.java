package com.hipstertech.service;

import com.hipstertech.service.dto.MarketingDocumentsDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link com.hipstertech.domain.MarketingDocuments}.
 */
public interface MarketingDocumentsService {

    /**
     * Save a marketingDocuments.
     *
     * @param marketingDocumentsDTO the entity to save.
     * @return the persisted entity.
     */
    MarketingDocumentsDTO save(MarketingDocumentsDTO marketingDocumentsDTO);

    /**
     * Get all the marketingDocuments.
     *
     * @return the list of entities.
     */
    List<MarketingDocumentsDTO> findAll();
    
    /**
     * Get all the marketingDocuments by job id.
     *
     * @return the list of entities.
     */
    List<MarketingDocumentsDTO> findByJobAndStatus(Long idJob, String Status);


    /**
     * Get the "id" marketingDocuments.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<MarketingDocumentsDTO> findOne(Long id);

    /**
     * Delete the "id" marketingDocuments.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
