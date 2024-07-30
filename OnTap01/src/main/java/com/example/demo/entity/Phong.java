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
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "phong")
public class Phong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_phong")
    private String ten;

    @Column(name = "so_luong_phong")
    private String soLuong;

    @Column(name = "ghi_chu")
    private String ghiChu;

    @Column(name = "trang_thai")
    private String trangThai;

    @ManyToOne
    @JoinColumn(name = "id_loai_phong",referencedColumnName = "id")
    private LoaiPhong loaiPhong;

}
