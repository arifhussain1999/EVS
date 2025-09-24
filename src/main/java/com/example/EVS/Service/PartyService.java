package com.example.EVS.Service;

import com.example.EVS.Model.Party;
import com.example.EVS.Repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartyService {

    @Autowired
    private PartyRepository partyRepository;

    // Add Party
    public Party addParty(Party party) {
        return partyRepository.save(party);
    }

    // View all Parties
    public List<Party> getAllParties() {
        return partyRepository.findAll();
    }
}
