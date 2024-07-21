package com.example.projetstage.model;

import com.example.projetstage.model.Enums.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String email;
	private String password;
	@Enumerated(EnumType.STRING)
	private Role role;
	private boolean isVerified;
	private String verificationCode;
	private String resetPasswordCode;
	
	
	public User() {
		super();
		this.role = Role.USER;
	    this.isVerified = false;
	    this.verificationCode = null;
	    this.resetPasswordCode = null;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Role getRole() {
		return role;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public String getResetPasswordCode() {
		return resetPasswordCode;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	public void setResetPasswordCode(String resetPasswordCode) {
		this.resetPasswordCode = resetPasswordCode;
	}
	
	
	
}
