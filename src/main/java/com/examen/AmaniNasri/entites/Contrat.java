package com.examen.AmaniNasri.entites;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Contrat {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idContrat;
    private String matricule ;
    @Temporal(TemporalType.DATE)
    private Date dateEffet ;
    @Enumerated(EnumType.STRING)
    private TypeContrat type;

}
