package com.test.pe.view.form;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.test.pe.domain.Auditory;
import com.test.pe.domain.Employee;
import com.test.pe.domain.Shop;

public class AuditoryForm {

	private int idAuditory;
	private int idEmployee;
	private int idShop;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date dateRegistry;
	
	public int getIdAuditory() {
		return idAuditory;
	}

	public void setIdAuditory(int idAuditory) {
		this.idAuditory = idAuditory;
	}

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public int getIdShop() {
		return idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	public Date getDateRegistry() {
		return dateRegistry;
	}

	public void setDateRegistry(Date dateRegistry) {
		this.dateRegistry = dateRegistry;
	}

	public Auditory GetAuditory(){
		return new Auditory(idAuditory
				,new Employee(idEmployee)
				,new Shop(idShop)
				,dateRegistry);
	}
}
