package br.com.ibm.challenge.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "cli_cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cli_id")
	private Long id;
	
	
	@Column(name="cli_nome", nullable=false, length=100)
	@NotNull(message = "O nome é obrigatório.")
	@Length(max=100, message="Nome deve conter até 100 caracteres.")
	private String nome;
	
	@Column(name="cli_cpf", nullable=false, length=11)
	@NotNull(message = "O CPF é obrigatório.")
	@Length(min=11, max=11, message="CPF deve conter 11 caracteres.")
	private String cpf;
	
	@Column(name="cli_agencia", nullable=false)
	private Integer agencia;
	
	@Column(name="cli_senha", nullable=false, length=8)
	@NotNull(message = "A senha é obrigatória.")
	@Length(min=4, max=8, message="A senha deve ser entre 4 e 8 caracteres.")
	private String senha;
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "con_conta")
	private Conta conta;

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	
}
