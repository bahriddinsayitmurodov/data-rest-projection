package com.example.rentcar.repository;

import com.example.rentcar.entity.Rent;
import com.example.rentcar.projections.RentProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "rent", excerptProjection = RentProjection.class)
public interface RentRepository extends JpaRepository<Rent,Integer> {
}
