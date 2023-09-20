package bts.sio.api.controller;

import bts.sio.api.model.Sport;
import bts.sio.api.service.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SportController {

    @Autowired
    private SportService sportService;

    /**
     * Read - Get all sport
     * @return - An Iterable object of Sport full filled
     */
    @GetMapping("/sport")
    public Iterable<Sport> getSport() {
        return sportService.getSports();
    }
}
