package com.example.btvnbuoi9.Entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "loai_phong_ban")
public class LoaiPhongBan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "ma")
    private String ma;
}
