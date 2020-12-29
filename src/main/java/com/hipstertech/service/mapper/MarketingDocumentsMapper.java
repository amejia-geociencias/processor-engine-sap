package com.hipstertech.service.mapper;


import com.hipstertech.domain.*;
import com.hipstertech.service.dto.MarketingDocumentsDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link MarketingDocuments} and its DTO {@link MarketingDocumentsDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface MarketingDocumentsMapper extends EntityMapper<MarketingDocumentsDTO, MarketingDocuments> {



    default MarketingDocuments fromId(Long id) {
        if (id == null) {
            return null;
        }
        MarketingDocuments marketingDocuments = new MarketingDocuments();
        marketingDocuments.setId(id);
        return marketingDocuments;
    }
}
