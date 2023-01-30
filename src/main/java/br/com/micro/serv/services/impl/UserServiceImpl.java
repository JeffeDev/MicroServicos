package br.com.micro.serv.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.micro.serv.domain.UserEntity;
import br.com.micro.serv.repositories.UserReposirory;
import br.com.micro.serv.services.UserService;
import br.com.micro.serv.services.exceptions.ObjectNotFoundException;

@Service
//@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	
	//@Autowired
	private final UserReposirory userRepository;	
	
	public UserServiceImpl(UserReposirory userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public UserEntity findById(Long id) {
		return userRepository.findById(id)
				.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	@Override
	public List<UserEntity> findAll() {
		return userRepository.findAll();
	}	
	
}
