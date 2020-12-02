package net.slipp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
//      model.addAttribute("serverName", "Multipart Server!!!");
System.out.println("111111111");
      return "index";
	}
}
