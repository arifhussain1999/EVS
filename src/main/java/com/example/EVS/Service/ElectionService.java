package com.example.EVS.Service;

import com.example.EVS.model.Election;
import com.example.EVS.Repository.ElectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectionService {

    @Autowired
    private ElectionRepository electionRepository;

    // Add Election
    public Election addElection(Election election) {
        return electionRepository.save(election);
    }

    // View all Elections
    public List<Election> getAllElections() {
        return electionRepository.findAll();
    }
}
