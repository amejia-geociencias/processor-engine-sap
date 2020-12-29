package com.hipstertech.domain;


import javax.persistence.*;

import java.io.Serializable;
import java.time.Instant;

import com.hipstertech.domain.enumeration.Status;

/**
 * A MarketingDocuments.
 */
@Entity
@Table(name = "marketing_documents")
public class MarketingDocuments implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The firstname attribute.
     */
    @Column(name = "doc_number")
    private Integer docNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @Column(name = "comments")
    private String comments;

    @Column(name = "processed_date")
    private Instant processedDate;

    @OneToOne
    @JoinColumn(unique = true)
    private Job job;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDocNumber() {
        return docNumber;
    }

    public MarketingDocuments docNumber(Integer docNumber) {
        this.docNumber = docNumber;
        return this;
    }

    public void setDocNumber(Integer docNumber) {
        this.docNumber = docNumber;
    }

    public Status getStatus() {
        return status;
    }

    public MarketingDocuments status(Status status) {
        this.status = status;
        return this;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public MarketingDocuments comments(String comments) {
        this.comments = comments;
        return this;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Instant getProcessedDate() {
        return processedDate;
    }

    public MarketingDocuments processedDate(Instant processedDate) {
        this.processedDate = processedDate;
        return this;
    }

    public void setProcessedDate(Instant processedDate) {
        this.processedDate = processedDate;
    }

    public Job getJob() {
        return job;
    }

    public MarketingDocuments job(Job job) {
        this.job = job;
        return this;
    }

    public void setJob(Job job) {
        this.job = job;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MarketingDocuments)) {
            return false;
        }
        return id != null && id.equals(((MarketingDocuments) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "MarketingDocuments{" +
            "id=" + getId() +
            ", docNumber=" + getDocNumber() +
            ", status='" + getStatus() + "'" +
            ", comments='" + getComments() + "'" +
            ", processedDate='" + getProcessedDate() + "'" +
            "}";
    }
}
