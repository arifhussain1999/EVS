package com.example.EVS.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String dateOfBirth; // format: YYYY-MM-DD

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false, unique = true)
    private String mobileNo;

    @Column(nullable = false)
    private String district;
}
