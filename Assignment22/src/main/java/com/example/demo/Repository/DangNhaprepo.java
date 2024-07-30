package com.example.demo.Repository;

import com.example.demo.Enty.DangNhapEnTy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DangNhaprepo extends JpaRepository<DangNhapEnTy, Integer> {
    Boolean existsByMaAndMatKhau (String ma, String matKhau);
}
