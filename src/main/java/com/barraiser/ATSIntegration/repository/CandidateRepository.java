package com.barraiser.ATSIntegration.repository;

import com.barraiser.ATSIntegration.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate,String> {
    Candidate findByName(String name);
}