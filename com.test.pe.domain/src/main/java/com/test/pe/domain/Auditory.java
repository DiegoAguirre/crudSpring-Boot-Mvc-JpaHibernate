	package com.test.pe.domain;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "auditory")
public class Auditory {
	@Id
	@Column(name = "idAuditory")
	private int idAuditory;
	@ManyToOne
	@JoinColumn(name="idEmployee",referencedColumnName="id")
	private Employee idEmployee;
	@ManyToOne
	@JoinColumn(name="idShop",referencedColumnName="id")
	private Shop idShop;
	@Column(name = "dateRegistry", unique = true)
	private Date dateRegistry;
	public Auditory(){}
	
	public Auditory(int idAuditory, Employee idEmployee, Shop idShop, Date dateRegistry) {
		super();
		this.idAuditory = idAuditory;
		this.idEmployee = idEmployee;
		this.idShop = idShop;
		this.dateRegistry = dateRegistry;
	}
	public int getIdAuditory() {
		return idAuditory;
	}
	public void setIdAuditory(int idAuditory) {
		this.idAuditory = idAuditory;
	}
	
	public Employee getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(Employee idEmployee) {
		this.idEmployee = idEmployee;
	}
	
	public Shop getIdShop() {
		return idShop;
	}
	public void setIdShop(Shop idShop) {
		this.idShop = idShop;
	}
	public Date getDateRegistry() {
		return dateRegistry;
	}
	public void setDateRegistry(Date dateRegistry) {
		this.dateRegistry = dateRegistry;
	}
	
	
}
