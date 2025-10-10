package com.coforge.project.busreservation.repository;
/**
 * Author : Sola.Sri
 * Date   : Oct 9, 2025
 * Time   : 9:35:59 AM
 *Project : bus-reservation
*/
import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.project.busreservation.model.BusSchedule;

public interface BusScheduleRepository extends JpaRepository<BusSchedule, Integer>{

}