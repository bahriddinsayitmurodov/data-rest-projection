package com.example.rentcar.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate startDate;

    private LocalDate endDate;

    @ManyToOne(fetch = FetchType.EAGER)
    private Car car;

    @ManyToOne(fetch = FetchType.EAGER)
    private User customer;
}
