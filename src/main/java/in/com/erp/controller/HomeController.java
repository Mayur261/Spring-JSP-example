package in.com.erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping({"/","/hello"})
	public String fun(@RequestParam(value = "name" , defaultValue = "mayur", required = true) String name)
	{
		//model.addAttribute("name", name);
		return "hello.jsp";
	}

}
