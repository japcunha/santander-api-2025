package com.Joane.santander_api_2025.repository;

import com.Joane.santander_api_2025.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface UserRepository extends JpaRepository<User,Long> {}
    //por que é uma interface?


