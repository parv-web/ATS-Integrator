package com.barraiser.ATSIntegration.service;

import com.barraiser.ATSIntegration.entity.Candidate;
import com.barraiser.ATSIntegration.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {
    @Autowired
    private CandidateRepository repository;

    public Candidate saveCandidate(Candidate candidate) {
        return repository.save(candidate);
    }

    public List<Candidate> saveCandidate(List<Candidate> candidates) {
        return repository.saveAll(candidates);
    }

    public List<Candidate> getCandidates() {
        return repository.findAll();
    }

    public Candidate getCandidateById(String id) {
        return repository.findById(id).orElse(null);
    }

    public Candidate getCandidateByName(String name) {
        return repository.findByName(name);
    }

    public Candidate updateCandidate(Candidate candidate) {
        Candidate existingCandidate = repository.findById(candidate.getId()).orElse(null);
        existingCandidate.setName(candidate.getName());
        return repository.save(existingCandidate);
    }


}
