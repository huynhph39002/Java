package com.example.demo.entities;


import jakarta.persistence.*;
//import jakarta.validation.constraints.Digits;
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
@Table(name = "KichThuoc")
public class KichThuoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;


    @Column(name = "Ma")
//    @NotBlank(message = "Khong duoc bo trong ma")
    private String ma;


    @Column(name = "Ten")
//    @NotBlank(message = "Khong duoc bo trong ten")
    private String ten;


    @Column(name = "TrangThai")
//    @Digits(integer = 1, fraction = 0)
    private Integer trangThai;
}
