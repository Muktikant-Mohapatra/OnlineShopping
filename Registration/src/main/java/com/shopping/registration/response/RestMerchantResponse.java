package com.shopping.registration.response;

public class RestMerchantResponse {
	private String name;
	private String email;
	private String phoneNo;
	private String address;
	private String dob;
	private String adharNo;
	private String pancardNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public String getPancardNo() {
		return pancardNo;
	}

	public void setPancardNo(String pancardNo) {
		this.pancardNo = pancardNo;
	}

	@Override
	public String toString() {
		return "RestMerchantResponse [name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", address="
				+ address + ", dob=" + dob + ", adharNo=" + adharNo + ", pancardNo=" + pancardNo + "]";
	}

}
