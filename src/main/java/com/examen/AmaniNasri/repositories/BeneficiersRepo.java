package com.examen.AmaniNasri.repositories;

import com.examen.AmaniNasri.entites.Beneficiers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiersRepo extends JpaRepository<Beneficiers,Integer> {
    Beneficiers getByCin(int cinBenef);
}
