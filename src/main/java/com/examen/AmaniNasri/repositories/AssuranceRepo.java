package com.examen.AmaniNasri.repositories;

import com.examen.AmaniNasri.entites.Assurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssuranceRepo extends JpaRepository<Assurance,Integer> {
}
