package com.coforge.project.busreservation.controller;
/**
 * Author : Sola.Sri
 * Date   : Oct 9, 2025
 * Time   : 9:32:28 AM
 *Project : bus-reservation
*/


/*public class BusController {

}*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.coforge.project.busreservation.model.Bus;
import com.coforge.project.busreservation.service.BusService;

import java.util.List;

@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private BusService service;

    @GetMapping("/all")
    public List<Bus> getAllBuses() { return service.getAllBuses(); }

    @PostMapping("/add")
    public Bus addBus(@RequestBody Bus bus) { return service.addBus(bus); }

    @PutMapping("/update")
    public Bus updateBus(@RequestBody Bus bus) { return service.updateBus(bus); }

    @DeleteMapping("/delete/{id}")
    public String deleteBus(@PathVariable int id) {
        service.deleteBus(id);
        return "Bus deleted successfully";
    }
}