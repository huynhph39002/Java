package com.example.demo.entities;


import jakarta.persistence.*;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class HoaDonChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "IdHoaDon")
    private Integer idHD;
    @Column(name = "IdSPCT")
    private Integer idSPCT;
//    @NotNull(message = "Số lượng không được để trống")
    @Column(name = "SoLuong")
    private Integer soLuong;
//    @NotNull(message = "Đơn giá không được để trống")
    @Column(name = "DonGia")
    private Float  donGia;
    @Column(name = "ThoiGian")
    private LocalDateTime thoiGian;
    @Column(name = "TrangThai")
    private int trangThai;



}
