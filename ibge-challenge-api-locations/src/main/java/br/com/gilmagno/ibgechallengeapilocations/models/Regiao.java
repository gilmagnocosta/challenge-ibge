package br.com.gilmagno.ibgechallengeapilocations.models;

public class Regiao {
	private Integer id;
	private String sigla;
	private String nome;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String siglaEstado) {
		this.sigla = siglaEstado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
