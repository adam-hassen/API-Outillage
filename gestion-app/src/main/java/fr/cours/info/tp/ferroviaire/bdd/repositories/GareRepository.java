package fr.cours.info.tp.ferroviaire.bdd.Repositories;

import fr.cours.info.tp.ferroviaire.bdd.modele.GareDAO;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GareRepository extends CrudRepository<GareDAO, Long> {
}
