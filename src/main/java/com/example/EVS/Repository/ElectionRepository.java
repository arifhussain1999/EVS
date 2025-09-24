package com.example.EVS.Repository;

import com.example.EVS.model.Election;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectionRepository extends JpaRepository<Election, Long> {
    // Optional: add custom queries if needed later
}
