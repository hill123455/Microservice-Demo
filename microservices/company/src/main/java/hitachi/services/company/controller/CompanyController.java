package hitachi.services.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CompanyController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping
	public String getUserInCompany() {
		String userInfo = restTemplate.getForObject("http://user-service/users/", String.class);
		return userInfo;
	}

	@GetMapping("/test")
	public String test() {
		return "Alor on danse";
	}

}
