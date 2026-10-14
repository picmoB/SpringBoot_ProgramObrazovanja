package com.example.SpringBoot_ProgramObrazovanja.repository;

import com.example.SpringBoot_ProgramObrazovanja.domain.Polaznik;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringDataPolaznikRepository extends JpaRepository<Polaznik, Long> {}
