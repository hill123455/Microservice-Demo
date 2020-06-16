package hitachi.services.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hitachi.services.user.dto.UserDto;

@RestController
@RequestMapping("users")
public class UserController {

	@GetMapping
	public String getUser() {
		UserDto user = new UserDto(1, "Hieu", 25);
		return user.toString();
	}
}
