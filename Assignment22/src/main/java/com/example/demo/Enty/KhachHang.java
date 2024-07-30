package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "KhachHang")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "Ma", length = 20)
    private String ma;

    @Column(name = "Ten", length = 30)
    private String ten;

    @Column(name = "TenDem", length = 30)
    private String tenDem;

    @Column(name = "Ho", length = 30)
    private String ho;

    @Column(name = "NgaySinh")
    private Date ngaySinh;

    @Column(name = "Sdt", length = 30)
    private String sdt;

    @Column(name = "DiaChi", length = 100)
    private String diaChi;

    @Column(name = "ThanhPho", length = 50)
    private String thanhPho;

    @Column(name = "QuocGia", length = 50)
    private String quocGia;

    @Column(name = "MatKhau", columnDefinition = "varchar(max)")
    private String matKhau;
}
