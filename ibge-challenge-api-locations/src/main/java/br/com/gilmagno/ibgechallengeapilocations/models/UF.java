package br.com.gilmagno.ibgechallengeapilocations.models;

public class UF {
	private Integer id;
	private String sigla;
	private String nome;
	private Regiao regiao;
	
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
	public Regiao getRegiao() {
		return regiao;
	}
	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}
	
}
