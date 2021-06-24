package br.com.gestao.proposta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gestao.proposta.model.Proposta;

public interface Propostas extends JpaRepository<Proposta, Long> {

}
