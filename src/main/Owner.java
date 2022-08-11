package main;

import java.time.LocalDate;
import java.time.Period;

public class Owner {
	String name;
	String surname;
	LocalDate birthDate;
	boolean customerType; // 0: Corporate, 1: Individual
	int age;
	long identityNumber;
	
	public Owner() {
		// TODO Auto-generated constructor stub
	}

	public Owner(String name, String surname, LocalDate birthDate, boolean customerType, long identityNumber) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.customerType = customerType;
		this.identityNumber = identityNumber;  
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public boolean getCustomerType() {
		return customerType;
	}
	public void setCustomerType(boolean customerType) {
		this.customerType = customerType;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	void setBirthDate(LocalDate birthDate){
		this.birthDate = birthDate;
	}
	public long getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(long identityNumber) {
		this.identityNumber = identityNumber;
	}

	int getAge(){
		return Period.between(birthDate, LocalDate.now()).getYears();
	}
	
}
