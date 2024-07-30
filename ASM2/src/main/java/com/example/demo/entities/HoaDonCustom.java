package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
@Entity
public class HoaDonCustom {
    @Id
    private Integer id;
    private String tenKH;
    private String tenNV;
    private Date ngayMuaHang;
    private int trangThai;
}
