package com.example.EVS.Service;

import com.example.EVS.Model.VoterRequest;
import com.example.EVS.Repository.VoterRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VoterRequestService {

    @Autowired
    private VoterRequestRepository voterRequestRepository;

    // Add Voter Request
    public VoterRequest addVoterRequest(VoterRequest voterRequest) {
        voterRequest.setApplicationStatus("PENDING");
        return voterRequestRepository.save(voterRequest);
    }

    // View all Voter Requests
    public List<VoterRequest> getAllVoterRequests() {
        return voterRequestRepository.findAll();
    }

    // Approve/Reject Voter Request
    public VoterRequest updateVoterRequestStatus(Long requestId, String status, String voterId) {
        Optional<VoterRequest> optionalRequest = voterRequestRepository.findById(requestId);
        if (optionalRequest.isPresent()) {
            VoterRequest request = optionalRequest.get();
            request.setApplicationStatus(status);
            if (voterId != null) {
                request.setVoterId(voterId);
            }
            return voterRequestRepository.save(request);
        } else {
            return null; // Or throw exception
        }
    }
}
