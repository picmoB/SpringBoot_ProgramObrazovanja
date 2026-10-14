package com.example.SpringBoot_ProgramObrazovanja.repository;

import com.example.SpringBoot_ProgramObrazovanja.domain.ProgramObrazovanja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataPORepository extends JpaRepository<ProgramObrazovanja, Long> {}
