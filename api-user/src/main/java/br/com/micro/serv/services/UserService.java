package br.com.micro.serv.services;

import java.util.List;

import br.com.micro.serv.domain.UserEntity;

public interface UserService {
	UserEntity findById(Long id);
	List<UserEntity> findAll();
	
}
