package com.shopping.registration.request;

public class RestAdminRequest {
	private String name;
	private String email;
	private String phone;
	private String address;
	private String username;
	private String password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		return "RestAdminRequest [name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address
				+ ", username=" + username + ", password=" + password + ", adharNo=" + adharNo + ", pancardNo="
				+ pancardNo + "]";
	}

}
