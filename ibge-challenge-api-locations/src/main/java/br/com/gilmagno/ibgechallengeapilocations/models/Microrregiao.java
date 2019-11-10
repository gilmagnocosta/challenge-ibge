package br.com.gilmagno.ibgechallengeapilocations.models;

public class Microrregiao {
	private Integer id;
	private String sigla;
	private String nome;
	private Mesorregiao mesorregiao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Mesorregiao getMesorregiao() {
		return mesorregiao;
	}
	public void setMesorregiao(Mesorregiao mesorregiao) {
		this.mesorregiao = mesorregiao;
	}
	
}
