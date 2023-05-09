package com.examen.AmaniNasri.controllers;

import com.examen.AmaniNasri.entites.Assurance;
import com.examen.AmaniNasri.entites.Beneficiers;
import com.examen.AmaniNasri.services.IBeneficiers;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@Tag(name="Department Management")

@RestController
@RequestMapping("/examen")
public class BeneficiersController {
    @Autowired
    IBeneficiers BenefService;
    @Operation (description = "adding a department")

    @PostMapping("/ajouterBenef")
    @ResponseBody
    public int ajouterBeneficaire (@RequestBody  Beneficiers bf){
        return BenefService.ajouterBeneficaire(bf);
    }
    @PostMapping("/ajouterAssurance/{cin-benef}")
    @ResponseBody
    public int ajouterAssurance(@RequestBody Assurance a, @PathVariable ("cin-benef")int cinBf) {
        return BenefService.ajouterAssurance(a,cinBf);

    }

}
