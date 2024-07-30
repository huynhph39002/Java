package com.example.btvnbuoi9.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "phong_ban")

public class PhongBan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    @Column(name = "so_luong_phong_ban")
    private int soLuongPhongBan;

    @Column(name = "so_luong_nhan_vien")
    private int soLuongNhanVien;

    @Column(name = "trang_thai")
    private int trangThai;

    @ManyToOne
    @JoinColumn(name = "loai_phong_ban_id", referencedColumnName = "id")
    private LoaiPhongBan loaiPhongBan;

}
