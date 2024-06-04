package com.collegetssm.internship;

public class Employee {
	private int empId;
	private String empNameString;
	private String designationString;
	private Address address;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpNameString() {
		return empNameString;
	}
	
	//here, if toString is not written then its OK 
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empNameString=" + empNameString + ", designationString="
				+ designationString + ", address=" + address + "]";
	}
	public void setEmpNameString(String empNameString) {
		this.empNameString = empNameString;
	}
	public String getDesignationString() {
		return designationString;
	}
	public void setDesignationString(String designationString) {
		this.designationString = designationString;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
