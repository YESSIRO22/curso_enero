package com.ejercicio;

public class Persona {
	
 
	String firstName;
	String lastName;
	int age;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age<0 || age >100) {
			this.age = 0;
		}else {
			this.age = age;
		}
		this.age=age;
	}
	
	public boolean isTeen() {
		if(age>12 && age <20) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getFullName() {
		boolean a=firstName.isEmpty();
		boolean b =lastName.isEmpty();
		if(a==false && b==false) {
			return (firstName+" "+lastName);
		}
		else if (a==true && b==false){
			return lastName;
		}
		else if (a==false && b==true) {
			return firstName;
		}
		else {
			return " ";
		}
		}
		
		
	}
