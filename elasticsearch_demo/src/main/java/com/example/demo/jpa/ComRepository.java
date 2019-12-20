package com.example.demo.jpa;

import com.example.demo.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComRepository extends JpaRepository<Company,Integer> {

}
