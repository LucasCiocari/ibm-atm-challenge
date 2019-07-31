package br.com.ibm.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ibm.challenge.domain.Conta;

public interface RepositorioConta extends JpaRepository<Conta, Long>{

}
