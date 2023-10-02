package bts.sio.api.controller.pari;

import bts.sio.api.model.pari.Pari;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import bts.sio.api.service.pari.PariService;

import java.util.Optional;

@RestController
public class PariController {

    @Autowired
    private PariService pariService;

    /**
     * Create - Add a new pari
     * @param pari An object athlete
     * @return The pari object saved
     */
    @PostMapping("/pari")
    public Pari createPari(@RequestBody Pari pari) {
        return pariService.savePari(pari);
    }


    /**
     * Read - Get one pari
     * @param id The id of the pari
     * @return A pari object full filled
     */
    @GetMapping("/pari/{id}")
    public Pari getPari(@PathVariable("id") final Long id) {
        Optional<Pari> pari = pariService.getPari(id);
        if(pari.isPresent()) {
            return pari.get();
        } else {
            return null;
        }
    }

    /**
     * Read - Get all pari
     * @return - An Iterable object of Pari full filled
     */
    @GetMapping("/pari")
    public Iterable<Pari> getPari() {
        return pariService.getPari();
    }

    /**
     * Update - Update an existing pari
     * @param id - The id of the pari to update
     * @param pari - The pari object updated
     * @return
     */
    @PutMapping("/pari/{id}")
    public Pari updatePari(@PathVariable("id") final Long id, @RequestBody Pari pari) {
        Optional<Pari> e = pariService.getPari(id);
        if(e.isPresent()) {
            Pari currentPari = e.get();

            String libelle = pari.getLibelle();
            if(libelle != null) {
                currentPari.setLibelle(libelle);
            }
            String place = pari.getPlace();
            if(place != null) {
                currentPari.setPlace(place);;
            }
            String mise = pari.getMise();
            if(mise != null) {
                currentPari.setMise(mise);;
            }

            pariService.savePari(currentPari);
            return currentPari;
        } else {
            return null;
        }
    }


    /**
     * Delete - Delete an pari
     * @param id - The id of the pari to delete
     */
    @DeleteMapping("/pari/{id}")
    public void deletePari(@PathVariable("id") final Long id) {
        pariService.deletePari(id);
    }

}
