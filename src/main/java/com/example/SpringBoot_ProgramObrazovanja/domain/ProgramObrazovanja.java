package com.example.SpringBoot_ProgramObrazovanja.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ProgramObrazovanja")
public class ProgramObrazovanja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String naziv;
    private String csvet;

    @OneToOne
    private Upis upis;

    /*
    @ManyToOne
    @JoinColumn(name = "programObrazovanja_id")
    private Upis upis;
     */
}
