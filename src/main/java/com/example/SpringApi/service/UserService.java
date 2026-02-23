package com.example.SpringApi.service;
import com.example.SpringApi.api.model.User;
import com.example.SpringApi.entity.Entitis;
import com.example.SpringApi.repo.EntitiesRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final EntitiesRepo entitiesRepo;

    public UserService(EntitiesRepo entitiesRepo) {
        this.entitiesRepo = entitiesRepo;
    }

    public Entitis getUser(Integer id) {
        Optional<Entitis> entitis = entitiesRepo.findById(id);
        return entitis.get();

    }


}
