package com.hipstertech.service.dto;

import io.swagger.annotations.ApiModelProperty;
import java.time.Instant;
import java.io.Serializable;
import com.hipstertech.domain.enumeration.Status;

/**
 * A DTO for the {@link com.hipstertech.domain.MarketingDocuments} entity.
 */
public class MarketingDocumentsDTO implements Serializable {
    
    private Long id;

    /**
     * The firstname attribute.
     */
    @ApiModelProperty(value = "The firstname attribute.")
    private Integer docNumber;

    private Status status;

    private String comments;

    private Instant processedDate;

    private Integer jobId;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(Integer docNumber) {
        this.docNumber = docNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Instant getProcessedDate() {
        return processedDate;
    }

    public void setProcessedDate(Instant processedDate) {
        this.processedDate = processedDate;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MarketingDocumentsDTO)) {
            return false;
        }

        return id != null && id.equals(((MarketingDocumentsDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "MarketingDocumentsDTO{" +
            "id=" + getId() +
            ", docNumber=" + getDocNumber() +
            ", status='" + getStatus() + "'" +
            ", comments='" + getComments() + "'" +
            ", processedDate='" + getProcessedDate() + "'" +
            ", jobId=" + getJobId() +
            "}";
    }
}
