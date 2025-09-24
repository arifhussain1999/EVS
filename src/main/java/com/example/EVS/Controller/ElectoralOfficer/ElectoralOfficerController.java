package com.example.EVS.Controller.ElectoralOfficer;

import com.example.EVS.Model.VoterRequest;
import com.example.EVS.Service.VoterRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/electoral-officer/voter-requests")
public class ElectoralOfficerController {

    @Autowired
    private VoterRequestService voterRequestService;

    // View all voter requests
    @GetMapping("/all")
    public ResponseEntity<List<VoterRequest>> getAllRequests() {
        List<VoterRequest> requests = voterRequestService.getAllVoterRequests();
        return ResponseEntity.ok(requests);
    }

    // Approve/Reject voter request
    @PutMapping("/update-status/{requestId}")
    public ResponseEntity<VoterRequest> updateStatus(
            @PathVariable Long requestId,
            @RequestParam String status,
            @RequestParam(required = false) String voterId) {
        VoterRequest updatedRequest = voterRequestService.updateVoterRequestStatus(requestId, status, voterId);
        if (updatedRequest != null) {
            return ResponseEntity.ok(updatedRequest);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
