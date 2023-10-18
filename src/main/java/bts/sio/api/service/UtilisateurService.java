package bts.sio.api.service;

import bts.sio.api.model.Athlete;
import bts.sio.api.model.Utilisateur;
import bts.sio.api.repository.UtilisateurRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public Optional<Utilisateur> getUtilisateur(final Long id) {
        return utilisateurRepository.findById(id);
    }

    public Iterable<Utilisateur> getUtilisateur() {
        return utilisateurRepository.findAll();
    }

    public void deleteUtilisateur(final Long id) {
        utilisateurRepository.deleteById(id);
    }

    public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
        Utilisateur savedUtilisateur = utilisateurRepository.save(utilisateur);
        return savedUtilisateur;
    }
}
