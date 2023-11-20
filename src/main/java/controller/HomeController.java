package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HomeController {
	
	@ResponseBody()
	@RequestMapping("/root")
	public String rootHandler() {
		return "/root";
	}
	
	@ResponseBody()
	@RequestMapping("/home")
	public String homeHandler() {
		return "/home";
	}
	
	@ResponseBody()
	@RequestMapping("/pg1")
	public String pg1Handler() {
		return "/pg1";
	}

}
