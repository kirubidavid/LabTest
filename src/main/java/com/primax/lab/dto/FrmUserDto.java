package com.primax.lab.dto;

import javax.validation.constraints.NotNull;

public class FrmUserDto {
	
	@NotNull
	private String txtEmail;

	public String getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(String txtEmail) {
		this.txtEmail = txtEmail;
	}
	
	
	

}
