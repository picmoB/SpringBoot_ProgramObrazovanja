package com.example.SpringBoot_ProgramObrazovanja.service;

import com.example.SpringBoot_ProgramObrazovanja.domain.Polaznik;
import com.example.SpringBoot_ProgramObrazovanja.domain.ProgramObrazovanja;
import com.example.SpringBoot_ProgramObrazovanja.domain.Upis;

import java.util.List;

public interface PO_Service {
    List<Polaznik> findByPolaznikId(Long id);
    List<ProgramObrazovanja> findByProgramObrazovanjaId(Long id);
    List<Upis> findByUpisId(Long id);
}
