package com.example.demo.repos;

import com.example.demo.entity.MauSac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MauSacRepos extends JpaRepository<MauSac,Integer> {
}
