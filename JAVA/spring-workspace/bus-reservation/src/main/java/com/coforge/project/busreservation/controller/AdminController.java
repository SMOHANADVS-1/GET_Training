package com.coforge.project.busreservation.controller;
/**
 * Author : Sola.Sri
 * Date   : Oct 9, 2025
 * Time   : 9:32:01 AM
 *Project : bus-reservation
*/




//package com.example.busreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.coforge.project.busreservation.model.Admin;
import com.coforge.project.busreservation.model.Bus;
import com.coforge.project.busreservation.model.BusSchedule;
import com.coforge.project.busreservation.service.AdminService;

//import com.example.busreservation.model.*;
//import com.example.busreservation.service.AdminService;


@RestController
@RequestMapping("/admin")
public class AdminController {

  @Autowired
  private AdminService service;

  // ➤ Create Admin
  @PostMapping("/add")
  public Admin addAdmin(@RequestBody Admin admin) {
      return service.addAdmin(admin);
  }

  // ➤ Update Bus Details
  @PutMapping("/bus/update/{busId}")
  public Bus updateBus(@PathVariable int busId, @RequestBody Bus bus) {
      return service.updateBus(busId, bus);
  }

  // ➤ Cancel a Bus
  @PutMapping("/bus/cancel/{busId}")
  public String cancelBus(@PathVariable int busId) {
      return service.cancelBus(busId);
  }

  // ➤ Change Bus Route
  @PutMapping("/bus/changeRoute/{busId}")
  public String changeBusRoute(@PathVariable int busId, @RequestParam String newRoute) {
      return service.changeBusRoute(busId, newRoute);
  }

  // ➤ Update Bus Schedule
  @PutMapping("/schedule/update/{scheduleId}")
  public BusSchedule updateSchedule(@PathVariable int scheduleId, @RequestBody BusSchedule schedule) {
      return service.updateBusSchedule(scheduleId, schedule);
  }

  // ➤ Assign Driver
  @PutMapping("/schedule/assignDriver/{scheduleId}")
  public String assignDriver(@PathVariable int scheduleId, @RequestParam String driverName) {
      return service.assignDriver(scheduleId, driverName);
  }
}


/*import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.project.busreservation.model.Admin;
import com.coforge.project.busreservation.repository.AdminRepository;
import com.coforge.project.busreservation.service.AdminService;

@RestController
@RequestMapping("/api")
public class AdminController {
	
	private final AdminRepository adminRepository;
	
	@Autowired
	private  AdminService adminService;

	public AdminController(AdminRepository adminRepository) {
		super();
		this.adminRepository = adminRepository;
	}

	
	
	@PostMapping("/admin")
	public ResponseEntity<Admin> saveAdmin(@Validated @RequestBody Admin admin)
	{
		try {
			
			Admin a = adminService.saveAdmin(admin);
			return ResponseEntity.status(HttpStatus.CREATED).body(a);
			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}
	
	
	@GetMapping("/admin")
	public ResponseEntity<List<Admin>> getAllAdmin() {
		List<Admin> admin = adminService.listAll();
		if (admin.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(admin);
	}
	

}*/
