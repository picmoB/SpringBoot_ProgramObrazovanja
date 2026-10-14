package com.example.SpringBoot_ProgramObrazovanja.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "upis")
public class Upis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private Polaznik polaznik;

    @OneToOne(cascade = CascadeType.ALL)
    private ProgramObrazovanja programObrazovanja;

    /*
    @OneToMany(mappedBy = "upis")
    //@JoinColumn(name = "polaznik_id")
    private List<Polaznik> polaznik = new ArrayList<>();
     */

    /*
    @OneToMany(mappedBy = "upis")
    //@JoinColumn(name = "programObrazovanja_id")
    private List<ProgramObrazovanja> programObrazovanja = new ArrayList<>();
     */
}
