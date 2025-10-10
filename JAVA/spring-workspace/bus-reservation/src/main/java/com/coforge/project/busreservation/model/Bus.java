package com.coforge.project.busreservation.model;
/**
 * Author : Sola.Sri
 * Date   : Oct 9, 2025
 * Time   : 9:33:26 AM
 *Project : bus-reservation
*/




import jakarta.persistence.*;

@Entity
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int busId;

    private String busNo;
    private String busType;
    private int availSeats;
    private boolean cancelled = false; // new field
    private String route; // new field for route name

    // Getters and Setters
    public int getBusId() { return busId; }
    public void setBusId(int busId) { this.busId = busId; }

    public String getBusNo() { return busNo; }
    public void setBusNo(String busNo) { this.busNo = busNo; }

    public String getBusType() { return busType; }
    public void setBusType(String busType) { this.busType = busType; }

    public int getAvailSeats() { return availSeats; }
    public void setAvailSeats(int availSeats) { this.availSeats = availSeats; }

    public boolean isCancelled() { return cancelled; }
    public void setCancelled(boolean cancelled) { this.cancelled = cancelled; }

    public String getRoute() { return route; }
    public void setRoute(String route) { this.route = route; }
}

/*import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bus")
public class Bus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bid")
	private Long id;

	@Column(name = "bus_no",nullable = false)
	private String busno;

	@Column(name = "bus_type",nullable = false)
	private String btype;

	@Column(nullable = false)
	private int availseats;

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus(Long id, String busno, String btype, int availseats) {
		super();
		this.id = id;
		this.busno = busno;
		this.btype = btype;
		this.availseats = availseats;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBusno() {
		return busno;
	}

	public void setBusno(String busno) {
		this.busno = busno;
	}

	public String getBtype() {
		return btype;
	}

	public void setBtype(String btype) {
		this.btype = btype;
	}

	public int getAvailseats() {
		return availseats;
	}

	public void setAvailseats(int availseats) {
		this.availseats = availseats;
	}
	
	


	


}*/