package com.examen.AmaniNasri.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Beneficiers {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idBeneficiaire;
    private int cin;
    private String nom;
    private String prenom;
    private String profession;
    private float salaire;
    @JsonIgnore

    @OneToMany(mappedBy="beneficiaire", fetch=FetchType.EAGER)
    private List<Assurance> assurances;}
