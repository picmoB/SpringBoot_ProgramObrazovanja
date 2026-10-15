package com.example.SpringBoot_ProgramObrazovanja.service;

import com.example.SpringBoot_ProgramObrazovanja.domain.Polaznik;
import com.example.SpringBoot_ProgramObrazovanja.domain.ProgramObrazovanja;
import com.example.SpringBoot_ProgramObrazovanja.domain.Upis;

import java.util.List;

public interface PO_Service {
    // POLAZNIK
    List<Polaznik> findByPolaznikId(Long id);
    Polaznik save(Polaznik polaznik);
    Polaznik updateByPolaznikId(Long id, Polaznik polaznik);
    void deleteByPolaznikId(Long id);

    // PROGRAM OBRAZOVANJA
    List<ProgramObrazovanja> findByProgramObrazovanjaId(Long id);
    ProgramObrazovanja save(ProgramObrazovanja programObrazovanja);
    ProgramObrazovanja updateByProgramObrazovanjaId(Long id, ProgramObrazovanja programObrazovanja);
    void deleteByProgramObrazovanjaId(Long id);

    // UPIS
    List<Upis> findByUpisId(Long id);
    Upis save(Upis upis);
    Upis updateByUpisId(Long id, Upis upis);
    void deleteByUpisId(Long id);
}
