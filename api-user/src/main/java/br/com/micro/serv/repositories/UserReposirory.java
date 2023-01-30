package br.com.micro.serv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.micro.serv.domain.UserEntity;

public interface UserReposirory extends JpaRepository<UserEntity, Long>{

}
