package com.hipstertech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hipstertech.domain.MarketingDocuments;

/**
 * Spring Data  repository for the MarketingDocuments entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MarketingDocumentsRepository extends JpaRepository<MarketingDocuments, Long> {
	
	List<MarketingDocuments> findByJob_IdAndStatus(Long id, String status);
}
