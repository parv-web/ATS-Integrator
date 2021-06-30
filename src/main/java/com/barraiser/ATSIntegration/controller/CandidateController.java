package com.barraiser.ATSIntegration.controller;

import com.barraiser.ATSIntegration.entity.Candidate;
import com.barraiser.ATSIntegration.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CandidateController {

    @Autowired
    private CandidateService service;

    @PostMapping("/addCandidate")
    public Candidate addCandidate(@RequestBody Candidate candidate) {
        return service.saveCandidate(candidate);
    }

    @GetMapping("/candidates")
    public List<Candidate> findAllCandidates() {
        return service.getCandidates();
    }

    @PutMapping("/update")
    public Candidate updateCandidate(@RequestBody Candidate candidate) {
        return service.updateCandidate(candidate);
    }
}
