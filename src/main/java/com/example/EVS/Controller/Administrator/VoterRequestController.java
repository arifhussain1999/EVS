package com.example.EVS.Controller.Administrator;

import com.example.EVS.Model.VoterRequest;
import com.example.EVS.Service.VoterRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voter-requests")
public class VoterRequestController {

    @Autowired
    private VoterRequestService voterRequestService;

    // View all Voter Requests (Admin / Electoral Officer)
    @GetMapping("/all")
    public ResponseEntity<List<VoterRequest>> getAllVoterRequests() {
        List<VoterRequest> requests = voterRequestService.getAllVoterRequests();
        return ResponseEntity.ok(requests);
    }
}
