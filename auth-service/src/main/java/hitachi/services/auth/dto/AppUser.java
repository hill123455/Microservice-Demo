package hitachi.services.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AppUser {

	private Integer id;
	
	private String username;

	private String password;

	private String role;
}
