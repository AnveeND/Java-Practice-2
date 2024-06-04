package com.collegetssm.internship;

public class Address {
	private int flatNo;
	private String AreaString;
	private String cityString;
	private int pincode;
	private String stateString;
	private String countryString;
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", AreaString=" + AreaString + ", cityString=" + cityString + ", pincode="
				+ pincode + ", stateString=" + stateString + ", countryString=" + countryString + "]";
	}
	public String getAreaString() {
		return AreaString;
	}
	public void setAreaString(String buildingString) {
		this.AreaString = buildingString;
	}
	public String getCityString() {
		return cityString;
	}
	public void setCityString(String cityString) {
		this.cityString = cityString;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getStateString() {
		return stateString;
	}
	public void setStateString(String stateString) {
		this.stateString = stateString;
	}
	public String getCountryString() {
		return countryString;
	}
	public void setCountryString(String countryString) {
		this.countryString = countryString;
	}

}
