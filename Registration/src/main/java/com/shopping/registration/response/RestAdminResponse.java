package com.shopping.registration.response;

public class RestAdminResponse {
	private String name;
	private String email;
	private String phone;
	private String address;
	private String username;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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
		return "RestAdminResponse [name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address
				+ ", username=" + username + ", adharNo=" + adharNo + ", pancardNo=" + pancardNo + "]";
	}

}
