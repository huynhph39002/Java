package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.PrimitiveIterator;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class ThucVat {

    private Integer id;

    private String loai;

    private String ten;

    private Integer tuoi;

    private Boolean gioiTinh;

    private String khuVuc;

}
