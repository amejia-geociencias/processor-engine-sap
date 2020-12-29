package com.hipstertech.service.dto;

import java.io.Serializable;
import com.hipstertech.domain.enumeration.DocumentType;
import com.hipstertech.domain.enumeration.Status;
import com.hipstertech.domain.enumeration.SourceType;

/**
 * A DTO for the {@link com.hipstertech.domain.Job} entity.
 */
public class JobDTO implements Serializable {
    
    private Long id;

    private String description;

    private DocumentType documentType;

    private Integer serie;

    private Status status;

    private SourceType sourceType;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public SourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobDTO)) {
            return false;
        }

        return id != null && id.equals(((JobDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "JobDTO{" +
            "id=" + getId() +
            ", description='" + getDescription() + "'" +
            ", documentType='" + getDocumentType() + "'" +
            ", serie=" + getSerie() +
            ", status='" + getStatus() + "'" +
            ", sourceType='" + getSourceType() + "'" +
            "}";
    }
}
