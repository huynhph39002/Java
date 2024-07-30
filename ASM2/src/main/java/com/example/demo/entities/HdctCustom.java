package com.example.demo.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
@Entity
public class HdctCustom {
    @Id
    @Column(name = "ID")
    private Integer id;
}
