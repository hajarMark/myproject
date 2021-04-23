package com.wildcodeschool.Myproject.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

	@GetMapping("/dctor/1")
	@ResponseBody
	public String docto1() {
		return "William Hartnell";
	}

	@GetMapping("/dctor/10")
	@ResponseBody
	public String doctor10() {
		return "Jodie Whittaker";
	}

	@GetMapping("/dctor/13")
	@ResponseBody
	public String doctor13() {
		return "David Tennant";
	}

}

