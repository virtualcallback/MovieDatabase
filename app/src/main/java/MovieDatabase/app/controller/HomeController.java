package MovieDatabase.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public static String home(Model view) {
		if( ! view.containsAttribute("view")) {
			return "redirect:/movies";
		}
		return "layout";
	}

}
