package com.example.demo.repositories;


import com.example.demo.entities.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
@EnableJpaRepositories
public interface HoaDonRepository extends JpaRepository<HoaDon, Integer> {

//    @Query("SELECT new SpctCustom (spct.id,spct.maSPCT, sp.ten,ms.ten,kt.ten, " +
//            " spct.soLuong, spct.donGia, spct.trangThai) " +
//            " FROM SanPhamCT spct JOIN SanPham sp ON spct.idSP = sp.id JOIN MauSac ms " +
//            "ON ms.id= spct.idMauSac JOIN KichThuoc kt ON kt.id = spct.idKichThuoc"
//    )
//    public List<SpctCustom> findAllWithPropName();
//
//    public Page<SanPhamCT> findByTenLike(String keyword, PageRequest p);

    @Query("SELECT new HoaDonCustom (hd.id, kh.ten, nv.ten, hd.ngayMuaHang, hd.trangThai)" +
            "From HoaDon hd JOIN KhachHang kh ON kh.id = hd.idKH "+
            "JOIN NhanVien nv ON nv.id = hd.idNV ")
    public List<HoaDonCustom> findAllWithPropName();

//    @Query("SELECT new HoaDonCustom (hd.id, kh.ten, nv.ten, hd.ngayMuaHang, hd.trangThai)" +
//            "From HoaDon hd JOIN KhachHang kh ON kh.id = hd.idKH "+
//            "JOIN NhanVien nv ON nv.id = hd.idNV ")
//        public Page<HoaDon> findByNgayMuaHangLike(Date ngay, PageRequest p);



}
