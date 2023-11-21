package com.example.rentcar.projections;

import com.example.rentcar.entity.Car;
import com.example.rentcar.entity.Rent;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;
import java.util.List;

@Projection(name = "rentProjection", types = {Rent.class})
public interface RentProjection {
     Integer getId();
     LocalDate getStartDate();
     LocalDate getEndDate();
     List<Car> getCars();
     List<Car> getUsers();

}
