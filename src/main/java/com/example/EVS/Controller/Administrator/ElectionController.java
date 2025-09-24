package com.example.EVS.Controller.Administrator;

import com.example.EVS.model.Election;
import com.example.EVS.Service.ElectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/elections")
public class ElectionController {

    @Autowired
    private ElectionService electionService;

    // Add Election
    @PostMapping("/add")
    public ResponseEntity<Election> addElection(@RequestBody Election election) {
        Election savedElection = electionService.addElection(election);
        return ResponseEntity.ok(savedElection);
    }

    // View all Elections
    @GetMapping("/all")
    public ResponseEntity<List<Election>> getAllElections() {
        List<Election> elections = electionService.getAllElections();
        return ResponseEntity.ok(elections);
    }
}
