package org.shahul.springboot.bootRESTCRUD.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	
	@Column(name="first_name")
	private String firstName;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int employeeId;
	@Column(name="email")
	private String emailId;
	@Column(name="last_name")
	private String lastName;
	
	
	public Employee(String firstName, String emailId, String lastName) {
		super();
		this.firstName = firstName;
		this.emailId = emailId;
		this.lastName = lastName;
	}
	
	

	public Employee() {
		super();
	}



	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", employeeId=" + employeeId + ", emailId=" + emailId
				+ ", lastName=" + lastName + "]";
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
