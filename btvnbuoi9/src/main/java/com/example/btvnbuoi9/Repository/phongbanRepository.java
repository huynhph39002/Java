package com.example.btvnbuoi9.Repository;

import com.example.btvnbuoi9.Entity.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface phongbanRepository extends JpaRepository<PhongBan, Integer> {
    @Query("SELECT PB FROM PhongBan PB WHERE PB.id = ?1")
    List<PhongBan> timkiem(Integer id);
}
