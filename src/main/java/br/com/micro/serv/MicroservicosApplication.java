package br.com.micro.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.micro.serv.domain.UserEntity;
import br.com.micro.serv.repositories.UserReposirory;

@SpringBootApplication
public class MicroservicosApplication implements CommandLineRunner{
	
	@Autowired
	private UserReposirory userRepository;

	public static void main(String[] args) {
		SpringApplication.run(MicroservicosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.saveAll(List.of(
				new UserEntity(null, "Jefferson", "email@gmail.com", "123", 1500.00),
				new UserEntity(null, "Pedro", "emailpedro@gmail.com", "123", 1000.00),
				new UserEntity(null, "Patricia", "emailpatricia@gmail.com", "123", 250.00)
		));
		
	}

}
