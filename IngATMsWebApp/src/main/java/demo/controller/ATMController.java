package demo.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import demo.model.AddressRestClient;

@Controller
@RequestMapping(value = "/atm")
public class ATMController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		AddressRestClient addressRestClient = new AddressRestClient();
		modelMap.put("atms", addressRestClient.findAll());
		return "atm/index";
	}
	
}
