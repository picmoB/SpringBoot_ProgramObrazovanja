package com.example.SpringBoot_ProgramObrazovanja.controller;

import com.example.SpringBoot_ProgramObrazovanja.domain.Polaznik;
import com.example.SpringBoot_ProgramObrazovanja.domain.ProgramObrazovanja;
import com.example.SpringBoot_ProgramObrazovanja.domain.Upis;
import com.example.SpringBoot_ProgramObrazovanja.service.PO_Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/PO")
@AllArgsConstructor
public class PO_Controller {

    private PO_Service service;

    @GetMapping("/polaznici/{id}")
    public List<Polaznik> findById(@RequestParam Long id){
        return service.findByPolaznikId(id);
    }

    @GetMapping("/programObrazovanja/{id}")
    public List<ProgramObrazovanja> findByProgramObrazovanjaId(@RequestParam Long id){
        return service.findByProgramObrazovanjaId(id);
    }

    @GetMapping("/upis/{id}")
    public List<Upis> findByUpisId(@RequestParam Long id){
        return service.findByUpisId(id);
    }
}
