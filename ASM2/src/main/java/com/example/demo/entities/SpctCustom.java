package com.example.demo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SpctCustom {
    @Id
    private Integer id;
    private String maSPCT;
    private String tenSP;
    private String mauSac;
    private String kichThuoc;
    private Integer soLuong;
    private Double donGia;
    private int trangThai;


}
