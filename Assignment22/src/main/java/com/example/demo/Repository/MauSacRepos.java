package com.example.demo.Repository;

import com.example.demo.Enty.MauSac;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MauSacRepos extends JpaRepository<MauSac,Integer> {
//    public Page<MauSac> findByTenLike(String keyword, PageRequest p);
}
