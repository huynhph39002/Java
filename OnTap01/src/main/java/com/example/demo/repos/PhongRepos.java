package com.example.demo.repos;

import com.example.demo.entity.Phong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhongRepos extends JpaRepository<Phong,Integer> {
}
