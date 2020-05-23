package com.kpjavaspringboot.repository;

import org.springframework.boot.autoconfigure.data.jpa.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kpjavaspringboot.model.City;

//@Repository
//@Repository("CityRepository")
//public interface CityRepository extends JpaRepository<City, Integer> {
//}

@Repository
public interface CityRepository extends CrudRepository<City, Integer> {
}