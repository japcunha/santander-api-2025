package com.Joane.santander_api_2025.service;

import com.Joane.santander_api_2025.domain.User;
import com.Joane.santander_api_2025.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public List<User> findAll(){
        return repository.findAll();
    }
    public User save(User user){
        return repository.save(user);
    }
    public Optional<User> findById(Long id){
        return repository.findById(id);
    }
    public void delete(Long id){
        repository.deleteById(id);
    }
}
