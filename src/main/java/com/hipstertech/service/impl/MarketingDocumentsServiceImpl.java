package com.hipstertech.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hipstertech.domain.MarketingDocuments;
import com.hipstertech.domain.enumeration.Status;
import com.hipstertech.repository.MarketingDocumentsRepository;
import com.hipstertech.service.MarketingDocumentsService;
import com.hipstertech.service.dto.MarketingDocumentsDTO;
import com.hipstertech.service.mapper.MarketingDocumentsMapper;

/**
 * Service Implementation for managing {@link MarketingDocuments}.
 */
@Service
@Transactional
public class MarketingDocumentsServiceImpl implements MarketingDocumentsService {

    private final Logger log = LoggerFactory.getLogger(MarketingDocumentsServiceImpl.class);

    private final MarketingDocumentsRepository marketingDocumentsRepository;

    private final MarketingDocumentsMapper marketingDocumentsMapper;

    public MarketingDocumentsServiceImpl(MarketingDocumentsRepository marketingDocumentsRepository, MarketingDocumentsMapper marketingDocumentsMapper) {
        this.marketingDocumentsRepository = marketingDocumentsRepository;
        this.marketingDocumentsMapper = marketingDocumentsMapper;
    }

    @Override
    public MarketingDocumentsDTO save(MarketingDocumentsDTO marketingDocumentsDTO) {
        log.debug("Request to save MarketingDocuments : {}", marketingDocumentsDTO);
        MarketingDocuments marketingDocuments = marketingDocumentsMapper.toEntity(marketingDocumentsDTO);
        marketingDocuments = marketingDocumentsRepository.save(marketingDocuments);
        return marketingDocumentsMapper.toDto(marketingDocuments);
    }

    @Override
    @Transactional(readOnly = true)
    public List<MarketingDocumentsDTO> findAll() {
        log.debug("Request to get all MarketingDocuments");
        return marketingDocumentsRepository.findAll().stream()
            .map(marketingDocumentsMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<MarketingDocumentsDTO> findOne(Long id) {
        log.debug("Request to get MarketingDocuments : {}", id);
        return marketingDocumentsRepository.findById(id)
            .map(marketingDocumentsMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete MarketingDocuments : {}", id);
        marketingDocumentsRepository.deleteById(id);
    }
    
	@Override
	public List<MarketingDocumentsDTO> findByJobAndStatus(int idJob, Status status) {
        log.debug("Request to get all findByJobAndStatus");
        return marketingDocumentsRepository.findByJobIdAndStatus(idJob,status).stream()
            .map(marketingDocumentsMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
	}
}
