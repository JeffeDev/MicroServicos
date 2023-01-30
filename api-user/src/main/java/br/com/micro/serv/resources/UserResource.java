package br.com.micro.serv.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.micro.serv.domain.UserEntity;

public interface UserResource {
	
	@GetMapping( value = "/{id}")
	ResponseEntity<UserEntity> findById(@PathVariable Long id);
	
	@GetMapping
	ResponseEntity <List<UserEntity>> findAll();
	
}
