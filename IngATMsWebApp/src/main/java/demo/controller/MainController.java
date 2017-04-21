package demo.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.authentication.*;
import org.springframework.security.core.*;
import org.springframework.security.core.context.*;
import org.springframework.security.core.userdetails.*;

@Controller
@RequestMapping(value = "/main")
public class MainController {

	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "redirect:/main/login.html";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(
			@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout,
			ModelMap modelMap) {
		if (error != null) {
			modelMap.addAttribute("msg",
					"Invalid username and password! Do you have account?");
		}
		if (logout != null) {
			modelMap.addAttribute("msg", "You've been logged out successfully.");
		}
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout() {
		return "login";
	}

	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public String accesssDenied(ModelMap modelMap) {
		Authentication auth = SecurityContextHolder.getContext()
				.getAuthentication();
		if (!(auth instanceof AnonymousAuthenticationToken)) {
			UserDetails userDetail = (UserDetails) auth.getPrincipal();
			modelMap.addAttribute("username", userDetail.getUsername());
		}
		return "403";
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome() {
		return "welcome";
	}

}
