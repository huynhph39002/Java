package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "phong")
public class Phong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "ma")
    private String ma;

    @Column(name = "so_luong")
    private String soLuong;

    @Column(name = "trang_thai")
    private Integer trangThai;

    @Column(name = "ghi_chu")
    private String ghiChu;

    @ManyToOne
    @JoinColumn(name = "loai_phong_id",referencedColumnName = "id")
    private LoaiPhong loaiPhong;
}
