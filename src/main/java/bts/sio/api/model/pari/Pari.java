package bts.sio.api.model.pari;

import bts.sio.api.model.Athlete;
import bts.sio.api.model.Sport;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "pari")
public class Pari {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "libelle")
    private String libelle;

    @Column(name = "place")
    private String place;

    @Column(name = "mise")
    private String mise;

    @Column(name = "cote")
    private String cote;


}