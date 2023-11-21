package com.example.rentcar.repository;

import com.example.rentcar.entity.Car;
import com.example.rentcar.entity.User;
import com.example.rentcar.projections.CarProjection;
import com.example.rentcar.projections.UserProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "user", excerptProjection = UserProjection.class)
public interface UserRepository extends JpaRepository<User,Integer> {
}
