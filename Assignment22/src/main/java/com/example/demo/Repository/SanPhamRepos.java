package com.example.demo.Repository;

import com.example.demo.Enty.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanPhamRepos extends JpaRepository<SanPham,Integer> {
}
