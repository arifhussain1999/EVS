package com.example.EVS.Service;

import com.example.EVS.Model.Vote;
import com.example.EVS.Repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteService {

    @Autowired
    private VoteRepository voteRepository;

    // Cast Vote
    public Vote castVote(Vote vote) {
        return voteRepository.save(vote);
    }

    // View Votes by Election (for results)
    public List<Vote> getVotesByElection(Long electionId) {
        return voteRepository.findByElectionId(electionId);
    }

}
