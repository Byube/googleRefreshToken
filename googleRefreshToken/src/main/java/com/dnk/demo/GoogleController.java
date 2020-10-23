package com.dnk.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GoogleController {
	
	@RequestMapping("/grft")
	public String insertClientid() {
		String address = "dnk/clientidInsert";
		return address;
	}
	
	
	@RequestMapping("/returngood")
	public String returnGood() {
		String address = "dnk/reciveCode";
		return address;
	}

	@RequestMapping("/login")
	public String goLogin(@RequestParam(value = "clientid", defaultValue = "-") String clientid, Model model) {
		String address = "dnk/login";
		model.addAttribute("clientid", clientid);
		return address;
	}

}
