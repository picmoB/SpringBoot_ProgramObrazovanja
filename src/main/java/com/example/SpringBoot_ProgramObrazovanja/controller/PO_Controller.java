package com.example.SpringBoot_ProgramObrazovanja.controller;

import com.example.SpringBoot_ProgramObrazovanja.domain.Polaznik;
import com.example.SpringBoot_ProgramObrazovanja.domain.ProgramObrazovanja;
import com.example.SpringBoot_ProgramObrazovanja.domain.Upis;
import com.example.SpringBoot_ProgramObrazovanja.service.PO_Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.DeleteExchange;

import java.util.List;

@RestController
@RequestMapping("/PO")
@AllArgsConstructor
public class PO_Controller {

    private PO_Service service;

    @GetMapping("/polaznici/{id}")
    public List<Polaznik> findById(@PathVariable Long id) {
        return service.findByPolaznikId(id);
    }

    @PostMapping("/polaznici")
    public Polaznik create(@RequestBody Polaznik polaznik) {
        return service.save(polaznik);
    }

    @PutMapping("/polaznici/{id}")
    public Polaznik update(@RequestBody Polaznik polaznik, @PathVariable Long id) {
        return service.updateByPolaznikId(id, polaznik);
    }

    @DeleteMapping("/polaznici/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteByPolaznikId(id);
    }

    // PROGRAM OBRAZOVANJA
    @GetMapping("/programObrazovanja/{id}")
    public List<ProgramObrazovanja> findByProgramObrazovanjaId(@PathVariable Long id){
        return service.findByProgramObrazovanjaId(id);
    }

    @PostMapping("/programObrazovanja")
    public ProgramObrazovanja save(@RequestBody ProgramObrazovanja polaznik){
        return service.save(polaznik);
    }

    @PutMapping("/programObrazovanja/{id}")
    public ProgramObrazovanja update(@RequestBody ProgramObrazovanja polaznik, @PathVariable Long id) {
        return service.updateByProgramObrazovanjaId(id, polaznik);
    }

    @DeleteMapping("/programObrazovanja/{id}")
    public void deleteByProgramObrazovanjaId(@PathVariable Long id) {
        service.deleteByProgramObrazovanjaId(id);
    }

    // UPIS
    @GetMapping("/upis/{id}")
    public List<Upis> findByUpisId(@PathVariable Long id){
        return service.findByUpisId(id);
    }

    @PostMapping("/upis")
    public Upis create(@RequestBody Upis upis){
        return service.save(upis);
    }

    @PutMapping("/upis/{id}")
    public Upis update(@RequestBody Upis upis, @PathVariable Long id) {
        return service.updateByUpisId(id, upis);
    }

    @DeleteMapping("/upis/{id}")
    public void deleteByUpisId(@PathVariable Long id) {
        service.deleteByUpisId(id);
    }
}
