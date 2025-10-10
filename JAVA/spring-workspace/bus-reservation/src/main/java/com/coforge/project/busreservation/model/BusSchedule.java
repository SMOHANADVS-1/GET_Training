package com.coforge.project.busreservation.model;
/**
 * Author : Sola.Sri
 * Date   : Oct 9, 2025
 * Time   : 9:33:40 AM
 *Project : bus-reservation
*/



import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class BusSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int scheduleId;

    private String driverName;
    private String busRoute;
    private LocalDateTime arrival;
    private LocalDateTime departure;
    private String stops;

    @ManyToOne
    @JoinColumn(name = "bus_id")
    private Bus bus;  // schedule belongs to a bus

    // Getters & Setters
    public int getScheduleId() { return scheduleId; }
    public void setScheduleId(int scheduleId) { this.scheduleId = scheduleId; }

    public String getDriverName() { return driverName; }
    public void setDriverName(String driverName) { this.driverName = driverName; }

    public String getBusRoute() { return busRoute; }
    public void setBusRoute(String busRoute) { this.busRoute = busRoute; }

    public LocalDateTime getArrival() { return arrival; }
    public void setArrival(LocalDateTime arrival) { this.arrival = arrival; }

    public LocalDateTime getDeparture() { return departure; }
    public void setDeparture(LocalDateTime departure) { this.departure = departure; }

    public String getStops() { return stops; }
    public void setStops(String stops) { this.stops = stops; }

    public Bus getBus() { return bus; }
    public void setBus(Bus bus) { this.bus = bus; }
}