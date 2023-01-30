package br.com.micro.serv.resources.impl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.micro.serv.domain.UserEntity;
import br.com.micro.serv.resources.UserResource;
import br.com.micro.serv.services.UserService;

@RestController
//@RequiredArgsConstructor
@RequestMapping(value="/api/users")
public class UserResourceImpl implements UserResource {
	
	//@Autowired
	private final UserService userService;
	
	public UserResourceImpl(UserService userService) {
		super();
		this.userService = userService;
	}

	public UserService getUserService() {
		return userService;
	}

	@Override
	public ResponseEntity<UserEntity> findById(Long id) {
		return ResponseEntity.ok().body(userService.findById(id));
	}

	@Override
	public ResponseEntity<List<UserEntity>> findAll() {
		return ResponseEntity.ok().body(userService.findAll());
	}

}
