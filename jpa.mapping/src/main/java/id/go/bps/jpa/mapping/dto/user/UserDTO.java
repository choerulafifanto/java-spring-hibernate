package id.go.bps.jpa.mapping.dto.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
	private String firstName;
	private String lastName;
	private String userName;
	private String email;
}