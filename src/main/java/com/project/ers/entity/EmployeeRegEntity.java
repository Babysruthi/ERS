package com.project.ers.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;


@Entity
@Table(name="employeeReg")

public class EmployeeRegEntity {

	

	@OneToMany(mappedBy="empEmail")
	private Set<EmpReimbursementEntity> reimbursements;
	
	
	@OneToOne(mappedBy="username")
	private EmployeeLoginEntity user;
	
	
	
		@Column(nullable=false)
	   private String name;
		
		@Column(nullable=false)
		private String dob;

		@Id	
	   private String email;
		
		@Column(nullable=false)
		private String address;
		
		@Column(nullable=false)
	    private long phnNo;
		
		@Column(nullable=false)
		private String gender;
		
		@Column(nullable=false)
		private String type;

		
		
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		
		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		
		

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public long getPhnNo() {
			return phnNo;
		}

		public void setPhnNo(long phnNo) {
			this.phnNo = phnNo;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}
		@Override
		public String toString() {
			return "EmployeeRegEntity [ user=" + user + ", name=" + name + ", dob="
					+ dob + ", email=" + email + ", address=" + address + ", phnNo=" + phnNo + ", gender=" + gender
					+ ", type=" + type + "]";
		}
		
	
}
