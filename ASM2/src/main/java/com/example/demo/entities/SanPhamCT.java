package com.example.demo.entities;


import jakarta.persistence.*;
//import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "SanPhamChiTiet")
public class SanPhamCT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "MaSPCT")
    private String maSPCT;

//    @ManyToOne
//    @JoinColumn(name="IdSanPham")
//    private SanPham sanPham;
//
//    @ManyToOne
//    @JoinColumn(name="IdMauSac")
//    private MauSac mauSac;
//
//    @ManyToOne
//    @JoinColumn(name="IdKichThuoc")
//    private KichThuoc kichThuoc;

    @Column(name = "IdSanPham")
    private Integer idSP;
    @Column(name = "IdMauSac")
    private Integer idMauSac;
    @Column(name = "IdKichThuoc")
    private Integer idKichThuoc;
    @Column(name = "SoLuong")
    private Integer soLuong;

    @Column(name = "DonGia")
    private Double donGia;

    @Column(name = "TrangThai")
    private int trangThai;


}
