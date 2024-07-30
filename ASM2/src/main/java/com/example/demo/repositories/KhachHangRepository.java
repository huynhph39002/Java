package com.example.demo.repositories;

import com.example.demo.entities.KhachHang;
import com.example.demo.entities.SanPham;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, Integer> {

    public Page<KhachHang> findByTenLike(String keyword, PageRequest p);
}