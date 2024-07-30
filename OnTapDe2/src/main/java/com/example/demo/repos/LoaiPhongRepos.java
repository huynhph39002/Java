package com.example.demo.repos;

import com.example.demo.entity.LoaiPhong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiPhongRepos extends JpaRepository<LoaiPhong,Integer> {
}
