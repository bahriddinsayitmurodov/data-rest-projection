package com.example.rentcar.projections;

import com.example.rentcar.entity.Car;
import com.example.rentcar.entity.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "userProjection", types = {User.class})
public interface UserProjection {
     Integer getId();
     String getFirstName();
     String getLastName();
     String getPhoneNumber();
     String getEmail();
     String getPassword();
      List<Car> getCars();
      List<Car> getRents();
}
