package com.example.EVS.Controller.Voter;

import com.example.EVS.Model.User;
import com.example.EVS.Model.VoterRequest;
import com.example.EVS.Model.Schedule;
import com.example.EVS.Model.Candidate;
import com.example.EVS.Model.Vote;
import com.example.EVS.Service.UserService;
import com.example.EVS.Service.VoterRequestService;
import com.example.EVS.Service.ScheduleService;
import com.example.EVS.Service.CandidateService;
import com.example.EVS.Service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voter")
public class VoterController {

    @Autowired
    private UserService userService;

    @Autowired
    private VoterRequestService voterRequestService;

    @Autowired
    private ScheduleService scheduleService;

    @Autowired
    private CandidateService candidateService;

    @Autowired
    private VoteService voteService;

    // Register user
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.registerUser(user));
    }

    // Add voter request
    @PostMapping("/voter-request/add")
    public ResponseEntity<VoterRequest> addVoterRequest(@RequestBody VoterRequest request) {
        return ResponseEntity.ok(voterRequestService.addVoterRequest(request));
    }

    // View VoterId
    @GetMapping("/voter-request/{userId}")
    public ResponseEntity<VoterRequest> getVoterRequestByUser(@PathVariable Long userId) {
        // Find the VoterRequest for this user
        List<VoterRequest> requests = voterRequestService.getAllVoterRequests();
        for (VoterRequest req : requests) {
            if (req.getUserId().equals(userId)) {
                return ResponseEntity.ok(req);
            }
        }
        return ResponseEntity.notFound().build();
    }


    // View schedule
    @GetMapping("/schedules/all")
    public ResponseEntity<List<Schedule>> getAllSchedules() {
        return ResponseEntity.ok(scheduleService.getAllSchedules());
    }

    // View candidates
    @GetMapping("/candidates/all")
    public ResponseEntity<List<Candidate>> getAllCandidates() {
        return ResponseEntity.ok(candidateService.getAllCandidates());
    }

    // Cast vote
    @PostMapping("/votes/cast")
    public ResponseEntity<Vote> castVote(@RequestBody Vote vote) {
        return ResponseEntity.ok(voteService.castVote(vote));
    }

    // View results
    @GetMapping("/votes/results/{electionId}")
    public ResponseEntity<List<Vote>> getVotesByElection(@PathVariable Long electionId) {
        return ResponseEntity.ok(voteService.getVotesByElection(electionId));
    }
}
