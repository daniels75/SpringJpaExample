package com.spr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name = "shops")
@Table(name = "shops")
public class Shop {

	private Integer id;
	private String name;
	//private Integer emplNumber;
	
	private Employee employee;

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

	// FIXME
//	@Column(name = "emplNumber")
	
//	@Transient
//	public Integer getEmplNumber() {
//		return employee.getId();
//	}
//
//	public void setEmplNumber(Integer emplNumber) {
//		employee.setId(emplNumber);
//	}

	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", employee="
				+ employee + "]";
	}

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "emplNumber")
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
