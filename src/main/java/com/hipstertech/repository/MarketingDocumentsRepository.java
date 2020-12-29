package com.hipstertech.repository;

import com.hipstertech.domain.MarketingDocuments;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the MarketingDocuments entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MarketingDocumentsRepository extends JpaRepository<MarketingDocuments, Long> {
}
