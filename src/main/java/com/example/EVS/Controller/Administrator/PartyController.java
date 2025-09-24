package com.example.EVS.Controller.Administrator;

import com.example.EVS.Model.Party;
import com.example.EVS.Service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/parties")
public class PartyController {

    @Autowired
    private PartyService partyService;

    // Add Party
    @PostMapping("/add")
    public ResponseEntity<Party> addParty(@RequestBody Party party) {
        Party savedParty = partyService.addParty(party);
        return ResponseEntity.ok(savedParty);
    }

    // View all Parties
    @GetMapping("/all")
    public ResponseEntity<List<Party>> getAllParties() {
        List<Party> parties = partyService.getAllParties();
        return ResponseEntity.ok(parties);
    }
}
