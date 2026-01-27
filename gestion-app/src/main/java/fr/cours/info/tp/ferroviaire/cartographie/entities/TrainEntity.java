package fr.cours.info.tp.ferroviaire.cartographie.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "trains")
public class TrainEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String matricule;

    @Column(nullable = false)
    private String type;

    public TrainEntity() {
    }

    public TrainEntity(String matricule, String type) {
        this.matricule = matricule;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
