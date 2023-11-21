package com.example.rentcar.projections;

import com.example.rentcar.entity.Car;
import com.example.rentcar.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "carProjection", types = {Car.class})
public interface CarProjection {
     Integer getId();

     String getModelName();

     String getNumber();

     User getOwner();
}
