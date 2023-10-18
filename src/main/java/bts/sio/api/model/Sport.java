package bts.sio.api.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sport")
public class Sport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nom")
    private String nom;

    @Column(name="descriptif")
    private String descriptif;

    @Column(name="nom_image")
    private String nom_image;


}
