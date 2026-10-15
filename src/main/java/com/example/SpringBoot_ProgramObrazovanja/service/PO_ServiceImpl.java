package com.example.SpringBoot_ProgramObrazovanja.service;

import com.example.SpringBoot_ProgramObrazovanja.domain.Polaznik;
import com.example.SpringBoot_ProgramObrazovanja.domain.ProgramObrazovanja;
import com.example.SpringBoot_ProgramObrazovanja.domain.Upis;
import com.example.SpringBoot_ProgramObrazovanja.repository.SpringDataPORepository;
import com.example.SpringBoot_ProgramObrazovanja.repository.SpringDataPolaznikRepository;
import com.example.SpringBoot_ProgramObrazovanja.repository.SpringDataUpisRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PO_ServiceImpl implements PO_Service {

    private SpringDataPolaznikRepository springDataPolaznikRepository;
    private SpringDataUpisRepository springDataUpisRepository;
    private SpringDataPORepository springDataPORepository;

    // POLAZNIK
    @Override
    public List<Polaznik> findByPolaznikId(Long id) {
        return springDataPolaznikRepository.findById(id).stream().toList();
    }

    @Override
    public Polaznik save(Polaznik polaznik) {
        return springDataPolaznikRepository.save(polaznik);
    }

    @Override
    public Polaznik updateByPolaznikId(Long id, Polaznik polaznik) {
        Optional<Polaznik> polaznikOptional = springDataPolaznikRepository.findById(id);
        if (polaznikOptional.isPresent()) {
            Polaznik polaznikEntity = polaznikOptional.get();
            polaznikEntity.setIme(polaznik.getIme());
            polaznikEntity.setPrezime(polaznik.getPrezime());
            polaznikEntity.setUpis(polaznik.getUpis());
            return  springDataPolaznikRepository.save(polaznikEntity);
        } else  {
            return null;
        }
    }

    @Override
    public void deleteByPolaznikId(Long id) {
        springDataPolaznikRepository.deleteById(id);
    }

    // PROGRAM OBRAZOVANJA
    @Override
    public List<ProgramObrazovanja> findByProgramObrazovanjaId(Long id) {
        return springDataPORepository.findById(id).stream().toList();
    }

    @Override
    public ProgramObrazovanja save(ProgramObrazovanja programObrazovanja) {
        return springDataPORepository.save(programObrazovanja);
    }

    @Override
    public ProgramObrazovanja updateByProgramObrazovanjaId(Long id, ProgramObrazovanja programObrazovanja) {
        Optional<ProgramObrazovanja> programObrazovanjaOptional = springDataPORepository.findById(id);
        if (programObrazovanjaOptional.isPresent()) {
            programObrazovanja = programObrazovanjaOptional.get();
            programObrazovanja.setNaziv(programObrazovanja.getNaziv());
            programObrazovanja.setCsvet(programObrazovanja.getCsvet());
            programObrazovanja.setUpis(programObrazovanja.getUpis());
            return springDataPORepository.save(programObrazovanja);
        } else {
            return null;
        }
    }

    @Override
    public void deleteByProgramObrazovanjaId(Long id) {
        springDataPORepository.deleteById(id);
    }

    // UPIS
    @Override
    public List<Upis> findByUpisId(Long id) {
        return springDataUpisRepository.findById(id).stream().toList();
    }

    @Override
    public Upis save(Upis upis) {
        return springDataUpisRepository.save(upis);
    }

    @Override
    public Upis updateByUpisId(Long id, Upis upis) {
        Optional<Upis> upisOptional = springDataUpisRepository.findById(id);
        if (upisOptional.isPresent()) {
            Upis upisEntity = upisOptional.get();
            upisEntity.setPolaznik(upis.getPolaznik());
            upisEntity.setProgramObrazovanja(upis.getProgramObrazovanja());
            return springDataUpisRepository.save(upisEntity);
        } else {
            return null;
        }
    }

    @Override
    public void deleteByUpisId(Long id) {
        springDataUpisRepository.deleteById(id);
    }
}
