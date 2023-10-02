package bts.sio.api.repository.pari;

import bts.sio.api.model.pari.Pari;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PariRepository extends CrudRepository<Pari, Long> {

}