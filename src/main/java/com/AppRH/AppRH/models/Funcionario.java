package com.AppRH.AppRH.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(unique = true)
	private String cpf;
	
	@NotEmpty
	private String nomeFuncionario;
	
	@NotEmpty
	private String funcao;
	
	@NotEmpty
	private String email;
}
