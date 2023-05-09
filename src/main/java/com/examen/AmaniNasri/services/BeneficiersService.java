package com.examen.AmaniNasri.services;

import com.examen.AmaniNasri.entites.Assurance;
import com.examen.AmaniNasri.entites.Beneficiers;
import com.examen.AmaniNasri.entites.Contrat;
import com.examen.AmaniNasri.repositories.AssuranceRepo;
import com.examen.AmaniNasri.repositories.BeneficiersRepo;
import com.examen.AmaniNasri.repositories.ContratRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class BeneficiersService implements IBeneficiers {
    @Autowired
    BeneficiersRepo beneficiersRepo;
    @Autowired
    ContratRepo contratRepo;
    @Autowired
    AssuranceRepo assuranceRepo;

    @Override
    public int ajouterBeneficaire(Beneficiers bf) {
        return beneficiersRepo.save(bf).getCin();

    }

    @Override
    public int ajouterAssurance(Assurance a, int cinBf) {
        Beneficiers beneficiers=beneficiersRepo.getByCin(cinBf);
        a.setBeneficiaire(beneficiers);
        Contrat c=contratRepo.save(a.getContrat());
        a.setContrat(c);
        return assuranceRepo.save(a).getIdAssurance();
    }


}
