package com.coforge.project.busreservation.service;
/**
 * Author : Sola.Sri
 * Date   : Oct 9, 2025
 * Time   : 9:36:29 AM
 *Project : bus-reservation
*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.project.busreservation.model.Admin;
import com.coforge.project.busreservation.model.Bus;
import com.coforge.project.busreservation.model.BusSchedule;
import com.coforge.project.busreservation.repository.AdminRepository;
import com.coforge.project.busreservation.repository.BusRepository;
import com.coforge.project.busreservation.repository.BusScheduleRepository;


import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepo;

    @Autowired
    private BusRepository busRepo;

    @Autowired
    private BusScheduleRepository scheduleRepo;

    // ---------------- Basic Admin ----------------
    public Admin addAdmin(Admin admin) {
        return adminRepo.save(admin);
    }

    // ---------------- Bus Management ----------------
    public Bus updateBus(int busId, Bus updatedBus) {
        Bus bus = busRepo.findById(busId).orElseThrow(() -> new RuntimeException("Bus not found"));
        bus.setBusNo(updatedBus.getBusNo());
        bus.setBusType(updatedBus.getBusType());
        bus.setAvailSeats(updatedBus.getAvailSeats());
        bus.setRoute(updatedBus.getRoute());
        return busRepo.save(bus);
    }

    public String cancelBus(int busId) {
        Optional<Bus> optionalBus = busRepo.findById(busId);
        if (optionalBus.isPresent()) {
            Bus bus = optionalBus.get();
            bus.setCancelled(true);
            busRepo.save(bus);
            return "Bus " + busId + " cancelled successfully!";
        }
        return "Bus not found!";
    }

    public String changeBusRoute(int busId, String newRoute) {
        Bus bus = busRepo.findById(busId).orElseThrow(() -> new RuntimeException("Bus not found"));
        bus.setRoute(newRoute);
        busRepo.save(bus);
        return "Bus route updated successfully!";
    }

    // ---------------- Schedule Management ----------------
    public BusSchedule updateBusSchedule(int scheduleId, BusSchedule updatedSchedule) {
        BusSchedule schedule = scheduleRepo.findById(scheduleId)
                .orElseThrow(() -> new RuntimeException("Schedule not found"));

        schedule.setBusRoute(updatedSchedule.getBusRoute());
        schedule.setArrival(updatedSchedule.getArrival());
        schedule.setDeparture(updatedSchedule.getDeparture());
        schedule.setStops(updatedSchedule.getStops());
        schedule.setDriverName(updatedSchedule.getDriverName());
        return scheduleRepo.save(schedule);
    }

    public String assignDriver(int scheduleId, String driverName) {
        BusSchedule schedule = scheduleRepo.findById(scheduleId)
                .orElseThrow(() -> new RuntimeException("Schedule not found"));
        schedule.setDriverName(driverName);
        scheduleRepo.save(schedule);
        return "Driver assigned successfully!";
    }
}


/*import java.util.List;

import org.springframework.stereotype.Service;

import com.coforge.project.busreservation.model.Admin;
import com.coforge.project.busreservation.repository.AdminRepository;

@Service
public class AdminService {
	private final AdminRepository arepo;

	public AdminService(AdminRepository arepo) {
		super();
		this.arepo = arepo;
	}
	
	
	
	public Admin saveAdmin(Admin a)
	{
		return arepo.save(a);
	}
	
	public List<Admin> listAll()
	{
		return arepo.findAll();
	}
	
	

}*/