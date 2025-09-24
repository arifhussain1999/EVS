package com.example.EVS.Controller.Administrator;

import com.example.EVS.Model.Vote;
import com.example.EVS.Service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/votes")
public class VoteController {

    @Autowired
    private VoteService voteService;

    // Cast Vote
    @PostMapping("/cast")
    public ResponseEntity<Vote> castVote(@RequestBody Vote vote) {
        Vote savedVote = voteService.castVote(vote);
        return ResponseEntity.ok(savedVote);
    }

    // View Votes by Election (for result)
    @GetMapping("/results/{electionId}")
    public ResponseEntity<List<Vote>> getVotesByElection(@PathVariable Long electionId) {
        List<Vote> votes = voteService.getVotesByElection(electionId);
        return ResponseEntity.ok(votes);
    }

}
