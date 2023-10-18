package bts.sio.api.repository;

import bts.sio.api.model.Utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {

}