package com.example.EVS.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long voteId;

    @Column(nullable = false)
    private Long electionId;

    @Column(nullable = false)
    private Long voterId;

    @Column(nullable = false)
    private Long candidateId;

    @Column(nullable = false)
    private LocalDate date;
}
