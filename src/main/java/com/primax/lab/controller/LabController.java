package com.primax.lab.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.primax.lab.dto.FrmUserDto;

@Controller
public class LabController {
	
	@GetMapping("/")
	public String getIndex(Model model) {
		
		model.addAttribute("frmUserDto", new FrmUserDto());
		
		return "sign-in";
	}
	
	
	@PostMapping("/")
	public String postIndex(@Valid FrmUserDto frmUserDto, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "sign-in";
		}
		return "authenticate";
		
	}

}
