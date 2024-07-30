package com.example.demo.Repository;

import com.example.demo.Enty.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienReois extends JpaRepository<NhanVien,Integer> {
}
