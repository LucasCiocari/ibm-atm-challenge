package br.com.ibm.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ibm.challenge.domain.Cliente;

public interface RepositorioCliente extends JpaRepository<Cliente, Long> {

}
