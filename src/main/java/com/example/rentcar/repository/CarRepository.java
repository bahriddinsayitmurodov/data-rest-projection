package com.example.rentcar.repository;

import com.example.rentcar.entity.Car;
import com.example.rentcar.projections.CarProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "car", excerptProjection = CarProjection.class)
public interface CarRepository extends JpaRepository<Car,Integer> {

}
