package com.example.SpringBoot_ProgramObrazovanja.service;

import com.example.SpringBoot_ProgramObrazovanja.domain.Polaznik;
import com.example.SpringBoot_ProgramObrazovanja.domain.ProgramObrazovanja;
import com.example.SpringBoot_ProgramObrazovanja.domain.Upis;
import com.example.SpringBoot_ProgramObrazovanja.repository.SpringDataPORepository;
import com.example.SpringBoot_ProgramObrazovanja.repository.SpringDataPolaznikRepository;
import com.example.SpringBoot_ProgramObrazovanja.repository.SpringDataUpisRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PO_ServiceImpl implements PO_Service {

    private SpringDataPolaznikRepository springDataPolaznikRepository;
    private SpringDataUpisRepository springDataUpisRepository;
    private SpringDataPORepository springDataPORepository;

    @Override
    public List<Polaznik> findByPolaznikId(Long id) {
        return springDataPolaznikRepository.findById(id).stream().toList();
    }

    @Override
    public List<ProgramObrazovanja> findByProgramObrazovanjaId(Long id) {
        return springDataPORepository.findById(id).stream().toList();
    }

    @Override
    public List<Upis> findByUpisId(Long id) {
        return springDataUpisRepository.findById(id).stream().toList();
    }
}
