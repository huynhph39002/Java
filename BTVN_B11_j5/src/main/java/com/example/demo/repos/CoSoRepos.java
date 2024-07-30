package com.example.demo.repos;

import com.example.demo.entity.CoSo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoSoRepos extends JpaRepository<CoSo,Integer> {
}
