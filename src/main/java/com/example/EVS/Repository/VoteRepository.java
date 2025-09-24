package com.example.EVS.Repository;

import com.example.EVS.Model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {

    List<Vote> findByElectionId(Long electionId);

    List<Vote> findByVoterId(Long voterId);
}
