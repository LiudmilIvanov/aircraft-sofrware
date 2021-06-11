package com.example.demo.model.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "airports")
public class Airport extends BaseEntity{

	@OneToOne
	private Location location;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	
}
