package com.examen.AmaniNasri.entites;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Assurance {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idAssurance;
    private String designation;
    private float montant;
    @ManyToOne
    private Contrat contrat;
    @ManyToOne
    private Beneficiers beneficiaire ;
}
