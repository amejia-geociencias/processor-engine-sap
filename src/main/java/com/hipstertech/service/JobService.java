package com.hipstertech.service;

import com.hipstertech.service.dto.JobDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link com.hipstertech.domain.Job}.
 */
public interface JobService {

    /**
     * Save a job.
     *
     * @param jobDTO the entity to save.
     * @return the persisted entity.
     */
    JobDTO save(JobDTO jobDTO);

    /**
     * Get all the jobs.
     *
     * @return the list of entities.
     */
    List<JobDTO> findAll();


    /**
     * Get the "id" job.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<JobDTO> findOne(Long id);

    /**
     * Delete the "id" job.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
    
    void run(Long idJob);
}
