package fr.cours.info.tp.ferroviaire.bdd.modele;

import jakarta.persistence.*;
//@Entity
//@Table(name = "gare")
//public class GareDAO {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String nom;
//
//    @Column(name = "nombre_quais")
//    private int nombreQuais;
//
//    public GareDAO() {}
//}



@Entity(name = "gare")
public class GareDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;

    @Column(name = "nombre_quais")
    private int nombreQuais;

    public GareDAO() {
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNombreQuais() {
        return nombreQuais;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNombreQuais(int nombreQuais) {
        this.nombreQuais = nombreQuais;
    }
}
