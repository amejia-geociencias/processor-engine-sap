package com.hipstertech.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.hipstertech.web.rest.TestUtil;

public class MarketingDocumentsTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(MarketingDocuments.class);
        MarketingDocuments marketingDocuments1 = new MarketingDocuments();
        marketingDocuments1.setId(1L);
        MarketingDocuments marketingDocuments2 = new MarketingDocuments();
        marketingDocuments2.setId(marketingDocuments1.getId());
        assertThat(marketingDocuments1).isEqualTo(marketingDocuments2);
        marketingDocuments2.setId(2L);
        assertThat(marketingDocuments1).isNotEqualTo(marketingDocuments2);
        marketingDocuments1.setId(null);
        assertThat(marketingDocuments1).isNotEqualTo(marketingDocuments2);
    }
}
