package bts.sio.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "typeEpreuve")
public class TypeEpreuve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom ;


}
