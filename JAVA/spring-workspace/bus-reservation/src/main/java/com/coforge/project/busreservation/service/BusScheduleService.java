package com.coforge.project.busreservation.service;
/**
 * Author : Sola.Sri
 * Date   : Oct 9, 2025
 * Time   : 9:36:47 AM
 *Project : bus-reservation
*/


/*public class BusScheduleService {

}*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.project.busreservation.model.BusSchedule;
import com.coforge.project.busreservation.repository.BusScheduleRepository;

import java.util.List;

@Service
public class BusScheduleService {

    @Autowired
    private BusScheduleRepository repo;

    public List<BusSchedule> getAllSchedules() { return repo.findAll(); }

    public BusSchedule addSchedule(BusSchedule schedule) { return repo.save(schedule); }

    public BusSchedule updateSchedule(BusSchedule schedule) { return repo.save(schedule); }

    public void deleteSchedule(int id) { repo.deleteById(id); }
}