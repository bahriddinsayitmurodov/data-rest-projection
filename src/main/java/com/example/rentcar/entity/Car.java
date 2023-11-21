package com.example.rentcar.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String modelName;

    private String number;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User owner;
}
