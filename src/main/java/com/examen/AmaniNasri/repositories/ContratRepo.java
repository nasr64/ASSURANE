package com.examen.AmaniNasri.repositories;

import com.examen.AmaniNasri.entites.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratRepo extends JpaRepository<Contrat,Integer> {
}
