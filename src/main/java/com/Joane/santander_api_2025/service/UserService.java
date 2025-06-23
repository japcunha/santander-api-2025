package com.Joane.santander_api_2025.service;

import com.Joane.santander_api_2025.domain.User;
import com.Joane.santander_api_2025.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public User save(User user) {
        return repository.save(user);
    }

    public User update(Long id, User userAtualizado) {
        User user = findById(id);
        if (user == null) return null;

        user.setNome(userAtualizado.getNome());
        user.setEmail(userAtualizado.getEmail());
        user.setSenha(userAtualizado.getSenha());

        return repository.save(user);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
