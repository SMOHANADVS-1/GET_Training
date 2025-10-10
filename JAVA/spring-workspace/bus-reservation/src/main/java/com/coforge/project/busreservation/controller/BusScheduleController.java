package com.coforge.project.busreservation.controller;
/**
 * Author : Sola.Sri
 * Date   : Oct 9, 2025
 * Time   : 9:32:50 AM
 *Project : bus-reservation
*/





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.coforge.project.busreservation.model.BusSchedule;
import com.coforge.project.busreservation.service.BusScheduleService;

import java.util.List;

@RestController
@RequestMapping("/schedule")
public class BusScheduleController {

    @Autowired
    private BusScheduleService service;

    @GetMapping("/all")
    public List<BusSchedule> getAllSchedules() { return service.getAllSchedules(); }

    @PostMapping("/add")
    public BusSchedule addSchedule(@RequestBody BusSchedule schedule) { return service.addSchedule(schedule); }

    @PutMapping("/update")
    public BusSchedule updateSchedule(@RequestBody BusSchedule schedule) { return service.updateSchedule(schedule); }

    @DeleteMapping("/delete/{id}")
    public String deleteSchedule(@PathVariable int id) {
        service.deleteSchedule(id);
        return "Schedule deleted successfully";
    }
}