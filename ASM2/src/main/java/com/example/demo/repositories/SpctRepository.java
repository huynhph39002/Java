package com.example.demo.repositories;

import com.example.demo.entities.SanPham;
import com.example.demo.entities.SanPhamCT;
import com.example.demo.entities.SpctCustom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface SpctRepository extends JpaRepository<SanPhamCT, Integer> {
//
//        @Query("SELECT new SpctCustom(spct.id, spct.idMauSac, spct.idKichThuoc, sp.ten, spct.maSPCT, " +
//            " spct.soLuong, spct.donGia, spct.trangThai) FROM SanPhamCT spct JOIN SanPham sp ON spct.idSP = sp.id")
//    public List<SpctCustom> findAllWithPropName();

    @Query("SELECT new SpctCustom (spct.id,spct.maSPCT, sp.ten,ms.ten,kt.ten, " +
            " spct.soLuong, spct.donGia, spct.trangThai) " +
            " FROM SanPhamCT spct JOIN SanPham sp ON spct.idSP = sp.id JOIN MauSac ms " +
            "ON ms.id= spct.idMauSac JOIN KichThuoc kt ON kt.id = spct.idKichThuoc"
    )
    public List<SpctCustom> findAllWithPropName();

    //    public Page<SanPhamCT> findByTenLike(String keyword, PageRequest p);
    @Query("SELECT new SpctCustom (spct.id,spct.maSPCT, sp.ten,ms.ten,kt.ten, " +
            " spct.soLuong, spct.donGia, spct.trangThai) " +
            " FROM SanPhamCT spct JOIN SanPham sp ON spct.idSP = sp.id JOIN MauSac ms " +
            "ON ms.id= spct.idMauSac JOIN KichThuoc kt ON kt.id = spct.idKichThuoc "
    )
    public List<SpctCustom> findAllWithPropName2(String a);
}
