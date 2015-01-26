package com.global.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * Carstate generated by MyEclipse Persistence Tools
 */

public class Carstate implements java.io.Serializable {

	// Fields

	private Integer carstateid;

	private String name;

	private Set cars = new HashSet(0);

	// Constructors

	/** default constructor */
	public Carstate() {
	}

	/** full constructor */
	public Carstate(String name, Set cars) {
		this.name = name;
		this.cars = cars;
	}

	// Property accessors

	public Integer getCarstateid() {
		return this.carstateid;
	}

	public void setCarstateid(Integer carstateid) {
		this.carstateid = carstateid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getCars() {
		return this.cars;
	}

	public void setCars(Set cars) {
		this.cars = cars;
	}

}