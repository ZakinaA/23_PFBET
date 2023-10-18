package bts.sio.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "epreuve")
public class Epreuve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "libelle")
    private String libelle ;

    @Column(name = "date_debut")
    private LocalDate date_debut;

    @Column(name = "date_fin")
    private LocalDate date_fin;

    @ManyToOne
    @JoinColumn(name = "sport_id")
    private Sport sport;

}
