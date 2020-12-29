package com.hipstertech.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.hipstertech.web.rest.TestUtil;

public class MarketingDocumentsDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(MarketingDocumentsDTO.class);
        MarketingDocumentsDTO marketingDocumentsDTO1 = new MarketingDocumentsDTO();
        marketingDocumentsDTO1.setId(1L);
        MarketingDocumentsDTO marketingDocumentsDTO2 = new MarketingDocumentsDTO();
        assertThat(marketingDocumentsDTO1).isNotEqualTo(marketingDocumentsDTO2);
        marketingDocumentsDTO2.setId(marketingDocumentsDTO1.getId());
        assertThat(marketingDocumentsDTO1).isEqualTo(marketingDocumentsDTO2);
        marketingDocumentsDTO2.setId(2L);
        assertThat(marketingDocumentsDTO1).isNotEqualTo(marketingDocumentsDTO2);
        marketingDocumentsDTO1.setId(null);
        assertThat(marketingDocumentsDTO1).isNotEqualTo(marketingDocumentsDTO2);
    }
}
