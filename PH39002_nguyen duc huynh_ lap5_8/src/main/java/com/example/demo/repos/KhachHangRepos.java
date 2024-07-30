package com.example.demo.repos;

import com.example.demo.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepos extends JpaRepository<KhachHang,Integer> {
}
