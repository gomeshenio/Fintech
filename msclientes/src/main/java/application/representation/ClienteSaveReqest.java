package application.representation;

import domain.Cliente;
import lombok.Data;

@Data
public class ClienteSaveReqest {
	
	private String cpf;
	private String nome;
	private Integer idade;
	
	public Cliente toModel() {
		return new Cliente(cpf, nome, idade);
	}
}
