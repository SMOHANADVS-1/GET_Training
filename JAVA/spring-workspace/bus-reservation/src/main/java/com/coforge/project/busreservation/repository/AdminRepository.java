package com.coforge.project.busreservation.repository;
/**
 * Author : Sola.Sri
 * Date   : Oct 9, 2025
 * Time   : 9:34:06 AM
 *Project : bus-reservation
*/
import org.springframework.data.jpa.repository.JpaRepository;
import com.coforge.project.busreservation.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> { }