package com.wildcodeschool.Myproject.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

	@GetMapping("/dctor/1")
	@ResponseBody
	public String index() {
		return "William Hartnell";
	}

	@GetMapping("/dctor/13")
	@ResponseBody
	public String index() {
		return "Jodie Whittaker";
	}

	@GetMapping("/dctor/10")
	@ResponseBody
	public String index() {
		return "David Tennant";
	}

}

