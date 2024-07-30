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

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
@Entity
@Table(name = "co_so")
public class CoSo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ma")
    private String maCoSo;

    @Column(name = "so_dien_thoai")
    private String sdt;

    @Column(name = "ghi_chu")
    private String ghiChu;

    @Column(name = "trang_thai")
    private Integer trangThai;

    @ManyToOne
    @JoinColumn(name = "tai_khoan_ngan_hang_id",referencedColumnName = "id")
    private TaiKhoanNganHang taiKhoanNganHang;
}
