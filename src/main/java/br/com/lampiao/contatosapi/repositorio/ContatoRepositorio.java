package br.com.lampiao.contatosapi.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lampiao.contatosapi.entidades.Contato;

@Repository
public interface ContatoRepositorio extends JpaRepository<Contato, Long> {}
