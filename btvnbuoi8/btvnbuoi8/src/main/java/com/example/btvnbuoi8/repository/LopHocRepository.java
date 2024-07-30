package com.example.btvnbuoi8.repository;

import com.example.btvnbuoi8.entity.LopHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LopHocRepository extends JpaRepository<LopHoc, Long> {
    @Query("select lh from LopHoc lh where lh.id=:id1")
    LopHoc getById(@Param("id1") Long id);

    @Query("select lh from LopHoc lh where lh.tenLop like :ten and lh.diaDiemLop like :diaDiem")
    List<LopHoc> getByKeyWord(@Param("ten") String ten, @Param("diaDiem") String diaDiem);
}
