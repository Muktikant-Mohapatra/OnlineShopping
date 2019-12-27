package com.shopping.registration.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

public class UserEntity {
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
	@Column(name = "PASSWORD", nullable = false, updatable = true, length = 14)
	private String password;
	@Column(name = "GENDER", nullable = false, updatable = true, length = 14)
	private String gender;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
				+ address + ", password=" + password + ", gender=" + gender + "]";
	}

}
