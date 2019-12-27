package com.shopping.registration.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

public class MerchantEntity {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(insertable = false)
	private String id;
	@Column(name = "NAME", nullable = false, updatable = false, length = 200)
	private String name;
	@Column(name = "EMAIL", nullable = false, updatable = false, length = 200)
	private String email;
	@Column(name = "PHONE", nullable = false, updatable = true, length = 20)
	private String phone;
	@Column(name = "ADDRESS", nullable = false, updatable = true, length = 200)
	private String address;
	@Column(name = "USERNAME", nullable = false, updatable = true, length = 20)
	private String username;
	@Column(name = "PASSWORD", nullable = false, updatable = true, length = 14)
	private String password;
	@Column(name = "ADHAR", nullable = false, updatable = true, length = 14)
	private String adharNo;
	@Column(name = "PANCARD", nullable = false, updatable = true, length = 14)
	private String pancardNo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
		return "MerchantEntity [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
				+ address + ", username=" + username + ", password=" + password + ", adharNo=" + adharNo
				+ ", pancardNo=" + pancardNo + "]";
	}

}
