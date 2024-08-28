package com.example.SpringApi.repo;

import com.example.SpringApi.entity.Entitis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntitiesRepo extends JpaRepository<Entitis, Integer> {
}
