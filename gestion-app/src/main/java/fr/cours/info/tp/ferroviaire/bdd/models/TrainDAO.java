package fr.cours.info.tp.ferroviaire.bdd.models;

import jakarta.persistence.*;

@Entity(name = "train")
public class TrainDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String matricule;

    public Long getId() {
        return id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
}
