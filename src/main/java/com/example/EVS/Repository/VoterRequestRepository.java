package com.example.EVS.Repository;

import com.example.EVS.Model.VoterRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoterRequestRepository extends JpaRepository<VoterRequest, Long> {
    // Optional: custom queries if needed
}
