package com.example.EVS.Repository;

import com.example.EVS.Model.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepository extends JpaRepository<Party, Long> {
    // Optional: add custom queries if needed later
}
