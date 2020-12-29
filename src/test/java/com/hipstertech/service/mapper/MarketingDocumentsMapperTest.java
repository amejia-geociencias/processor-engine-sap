package com.hipstertech.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MarketingDocumentsMapperTest {

    private MarketingDocumentsMapper marketingDocumentsMapper;

    @BeforeEach
    public void setUp() {
        marketingDocumentsMapper = new MarketingDocumentsMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        Long id = 1L;
        assertThat(marketingDocumentsMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(marketingDocumentsMapper.fromId(null)).isNull();
    }
}
