package com.example.SpringBoot_ProgramObrazovanja.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "polaznik")
public class Polaznik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ime;
    private String prezime;

    @OneToOne
    private Upis upis;

    /*
    @ManyToOne
    @JoinColumn(name = "polaznik_id")
    private Upis upis;
     */
}
