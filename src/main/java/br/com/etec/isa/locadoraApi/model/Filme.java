package br.com.etec.isa.locadoraApi.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table (name = "Filme")
public class Filme {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomefilme;

    @ManyToOne
    @JoinColumn(name = "idgenero")
    private Genero genero;


}
