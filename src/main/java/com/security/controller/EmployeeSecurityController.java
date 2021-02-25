package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee/security")
public class EmployeeSecurityController {

	@GetMapping("/token")
	public String getMyUserTokenByUserName() {
		return "xyzeesdfawllleresxwsdfewjlelre";
	}
}
