package com.example.EVS.Controller.Administrator;

import com.example.EVS.Model.Candidate;
import com.example.EVS.Service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/candidates")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    // Add Candidate
    @PostMapping("/add")
    public ResponseEntity<Candidate> addCandidate(@RequestBody Candidate candidate) {
        Candidate savedCandidate = candidateService.addCandidate(candidate);
        return ResponseEntity.ok(savedCandidate);
    }

    // View all Candidates
    @GetMapping("/all")
    public ResponseEntity<List<Candidate>> getAllCandidates() {
        List<Candidate> candidates = candidateService.getAllCandidates();
        return ResponseEntity.ok(candidates);
    }
}
