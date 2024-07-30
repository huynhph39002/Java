package com.example.demo.entities;


import jakarta.persistence.*;
//import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "NhanVien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

//    @NotBlank(message = "Mã NV không được để trống")
    @Column(name = "Ma")
    private String maNV;

//    @NotBlank(message = "Tên NV không được để trống")
    @Column(name = "Ten")
    private String ten;

//    @NotBlank(message = "Tên đăng nhập không được để trống")
    @Column(name = "TenDangNhap")
    private String tenDangNhap;

//    @NotBlank(message = "Mật khẩu không được để trống")
    @Column(name = "MatKhau")
    private String matKhau;

    @Column(name = "TrangThai")
    private int trangThai;


}
