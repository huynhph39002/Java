package com.example.demo.repos;

import com.example.demo.entity.TaiKhoanNganHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaiKhoanNganHangRepos extends JpaRepository<TaiKhoanNganHang,Integer> {
}
