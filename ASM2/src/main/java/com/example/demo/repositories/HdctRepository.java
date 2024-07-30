package com.example.demo.repositories;

import com.example.demo.entities.HoaDonChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HdctRepository extends JpaRepository<HoaDonChiTiet, Integer> {
}
