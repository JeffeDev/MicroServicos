package br.com.micro.serv.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "TBL_User")
//@Getter @Setter @AllArgsConstructor @NoArgsConstructor 
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class UserEntity {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	//@EqualsAndHashCode.Include
	private Long id;
	
	private String nome;
	private String email;
	private String senha;
	private Double precoHora;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Double getPrecoHora() {
		return precoHora;
	}
	public void setPrecoHora(Double precoHora) {
		this.precoHora = precoHora;
	}
	
	public UserEntity(Long id, String nome, String email, String senha, Double precoHora) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.precoHora = precoHora;
	}
		
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserEntity other = (UserEntity) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
