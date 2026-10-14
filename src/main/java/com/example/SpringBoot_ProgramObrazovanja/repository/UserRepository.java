package com.example.SpringBoot_ProgramObrazovanja.repository;

import com.example.SpringBoot_ProgramObrazovanja.domain.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserInfo, Long> {
    public UserInfo findByUsername(String username);
}
