package com.examen.AmaniNasri.services;

import com.examen.AmaniNasri.entites.Assurance;
import com.examen.AmaniNasri.entites.Beneficiers;

public interface IBeneficiers {
    public int ajouterBeneficaire (Beneficiers bf);
    public int ajouterAssurance (Assurance a, int cinBf);

}
