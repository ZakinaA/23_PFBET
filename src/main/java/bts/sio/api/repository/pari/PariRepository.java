package bts.sio.api.repository.pari;

import bts.sio.api.model.pari.Pari;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PariRepository extends CrudRepository<Pari, Long> {

        List<Pari> findByUtilisateurId(Long utilisateur_id);


}