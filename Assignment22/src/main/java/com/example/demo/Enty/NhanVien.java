package com.example.demo.Enty;


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

import java.util.Date;

@Entity
@Table(name = "NhanVien")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "Id")
    private Integer id;

    @Column(name = "Ma", length = 20)
    private String ma;

    @Column(name = "Ten", length = 30)
    private String ten;

    @Column(name = "TenDem", length = 30)
    private String tenDem;

    @Column(name = "Ho", length = 30)
    private String ho;

    @Column(name = "GioiTinh", length = 10)
    private String gioiTinh;

    @Column(name = "NgaySinh")
    private Date ngaySinh;

    @Column(name = "DiaChi", length = 100)
    private String diaChi;

    @Column(name = "Sdt", length = 30)
    private String sdt;

    @Column(name = "MatKhau", columnDefinition = "varchar(max)")
    private String matKhau;

    @Column(name = "IdCH")
    private Integer idCH;

    @Column(name = "IdCV")
    private Integer idCV;

    @Column(name = "IdGuiBC")
    private Integer idGuiBC;

    @Column(name = "TrangThai")
    private Integer trangThai;
}

