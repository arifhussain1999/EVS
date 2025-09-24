package com.example.EVS.Service;

import com.example.EVS.Model.Candidate;
import com.example.EVS.Repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    // Add Candidate
    public Candidate addCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    // View all Candidates
    public List<Candidate> getAllCandidates() {
        return candidateRepository.findAll();
    }
}
