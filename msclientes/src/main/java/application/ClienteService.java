package application;


import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import domain.Cliente;
import infra.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteService {
	
	private final ClienteRepository clienteRepository;
	
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Optional<Cliente> getByCPF(String cpf) {
		return clienteRepository.findByCpf(cpf);
	}

}













