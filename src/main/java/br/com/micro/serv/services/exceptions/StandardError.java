package br.com.micro.serv.services.exceptions;

import java.time.LocalDateTime;

//@Getter  @AllArgsConstructor
public class StandardError {
	private LocalDateTime datahora;
	private String erro;
	private int status;
	private String path;
	public LocalDateTime getDatahora() {
		return datahora;
	}

	public String getErro() {
		return erro;
	}

	public int getStatus() {
		return status;
	}

	public String getPath() {
		return path;
	}

	public StandardError(LocalDateTime datahora, String erro, int status, String path) {
		super();
		this.datahora = datahora;
		this.erro = erro;
		this.status = status;
		this.path = path;
	}
	public StandardError() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
