package com.example.demo.repos;

import com.example.demo.entity.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinhVienRepos extends JpaRepository<SinhVien,Long> {

}
