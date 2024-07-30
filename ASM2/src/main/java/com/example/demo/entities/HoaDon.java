package com.example.demo.entities;


import jakarta.persistence.*;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "HoaDon")
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "IdNV")
    private Integer idNV;
    @Column(name = "IdKH")
    private Integer idKH;
    @Column(name = "NgayMuaHang")
//    @NotNull(message = "Ngày mua hàng không được để trống")
    private Date ngayMuaHang;
    @Column(name = "TrangThai")
    private int trangThai;


}
