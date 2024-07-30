package com.example.demo.repos;

import com.example.demo.entity.DatPhong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatPhongRepos extends JpaRepository<DatPhong,Integer> {
}
