package com.example.SpringBoot_ProgramObrazovanja.repository;

import com.example.SpringBoot_ProgramObrazovanja.domain.Upis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataUpisRepository extends JpaRepository<Upis, Long> {}
