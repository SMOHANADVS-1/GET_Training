package com.coforge.project.busreservation.service;
/**
 * Author : Sola.Sri
 * Date   : Oct 9, 2025
 * Time   : 9:37:49 AM
 *Project : bus-reservation
*/


/*public class BusService {

}*/



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.project.busreservation.model.Bus;
import com.coforge.project.busreservation.repository.BusRepository;

import java.util.List;

@Service
public class BusService {

    @Autowired
    private BusRepository repo;

    public List<Bus> getAllBuses() { return repo.findAll(); }

    public Bus addBus(Bus bus) { return repo.save(bus); }

    public Bus updateBus(Bus bus) { return repo.save(bus); }

    public void deleteBus(int id) { repo.deleteById(id); }
}
