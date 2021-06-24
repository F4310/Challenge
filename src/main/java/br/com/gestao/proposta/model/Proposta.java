package br.com.gestao.proposta.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


@Entity
public class Proposta implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	private String endereco;
	private int numero;
	private String cidade;
	private String estado;
	private String cep;
	private String cpf;
	private String rg;
	private String nascimento;
	private String email;
	private String telefoneFixo;
	private String celular;
	private String tipoFinanciamento;
	private int nPrestacao;
	private float valorProposta;
	private float salario;
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getTipoFinanciamento() {
		return tipoFinanciamento;
	}
	public void setTipoFinanciamento(String tipoFinanciamento) {
		this.tipoFinanciamento = tipoFinanciamento;
	}
	public int getnPrestacao() {
		return nPrestacao;
	}
	public void setnPrestacao(int nPrestacao) {
		this.nPrestacao = nPrestacao;
	}
	public float getValorProposta() {
		return valorProposta;
	}
	public void setValorProposta(float valorProposta) {
		this.valorProposta = valorProposta;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}

	 
	
