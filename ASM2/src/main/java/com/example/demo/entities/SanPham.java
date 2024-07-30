package com.example.demo.entities;

import jakarta.persistence.*;
//import jakarta.validation.constraints.Digits;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SanPham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

//    @NotBlank(message = "Khong duoc bo trong")
    @Column(name = "Ma")
    private String ma;

//    @NotBlank(message = "Khong duoc bo trong")
    @Column(name = "Ten")
    private String ten;

//    @NotNull
    @Column(name = "TrangThai")
//    @Digits(integer = 1, fraction = 0)
    private Integer trangThai;

}
