package com.masomenos.virtualenvironment.dto;

public class ChangePasswordForm {

	private Long id;
	
	private String currentPassword;
	
	private String newPassword;
	
	private String confirmPassword;
	
	public ChangePasswordForm() { }
	
	public ChangePasswordForm(Long id) {this.id = id;}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCurrentPassword() {
		return currentPassword;
	}
	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}