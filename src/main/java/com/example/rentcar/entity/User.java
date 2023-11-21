package com.example.rentcar.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String email;

    private String password;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_cars",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "car_id"))
    private List<Car> cars;


    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_rents",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "rent_id")
    )
    private List<Rent> rents;
}
