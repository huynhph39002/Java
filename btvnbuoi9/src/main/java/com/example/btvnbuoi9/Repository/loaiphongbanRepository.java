package com.example.btvnbuoi9.Repository;

import com.example.btvnbuoi9.Entity.LoaiPhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface loaiphongbanRepository extends JpaRepository<LoaiPhongBan, Integer> {
}
