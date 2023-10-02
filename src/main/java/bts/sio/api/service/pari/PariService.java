package bts.sio.api.service.pari;

import bts.sio.api.model.pari.Pari;
import bts.sio.api.repository.pari.PariRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class PariService {
    @Autowired
    private PariRepository pariRepository;

    public Optional<Pari> getPari(final Long id) {
        return pariRepository.findById(id);
    }

    public Iterable<Pari> getPari() {
        return pariRepository.findAll();
    }

    public void deletePari(final Long id) {
        pariRepository.deleteById(id);
    }

    public Pari savePari(Pari pari) {
        Pari savedPari = pariRepository.save(pari);
        return savedPari;
    }
}
