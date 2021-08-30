package br.com.lampiao.contatosapi.entidades;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Contato {
	
	private Long id;
	private String nome;
	private String telefone;

}
