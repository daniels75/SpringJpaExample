package com.spr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "shops")
@Table(name = "shops")
public class Shop {

	private Integer id;
	private String name;
	private Integer emplNumber;
	
	//private Employee employee;

	@Id
	@GeneratedValue
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "emplNumber")
	public Integer getEmplNumber() {
		return emplNumber;
	}

	public void setEmplNumber(Integer emplNumber) {
		this.emplNumber = emplNumber;
	}

	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", emplNumber="
				+ emplNumber + "]";
	}
	
	
}
