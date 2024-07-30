package com.example.demo.entities;


import jakarta.persistence.*;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "KhachHang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

//    @NotBlank(message = "Tên KH không được để trống")
    @Column(name = "Ten")
    private String ten;

//    @NotBlank(message = "Sdt KH không được để trống")
    @Column(name = "SDT")
    private String sdt;

//    @NotBlank(message = "Mã KH không được để trống")
    @Column(name = "Ma")
    private String maKH;

//    @NotNull
    @Column(name = "TrangThai")
    private int trangThai;
}
