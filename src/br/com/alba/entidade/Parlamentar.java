package br.com.alba.entidade;

public class Parlamentar {
	
	private int idParlamentar;
	private String nomeParlamentar;
	private String siglaPartido;
	private String sexo;
	private String ativo;
	
	public Parlamentar() {
		
	}

	public int getIdParlamentar() {
		return idParlamentar;
	}

	public void setIdParlamentar(int idParlamentar) {
		this.idParlamentar = idParlamentar;
	}

	public String getNomeParlamentar() {
		return nomeParlamentar;
	}

	public void setNomeParlamentar(String nomeParlamentar) {
		this.nomeParlamentar = nomeParlamentar;
	}

	public String getSiglaPartido() {
		return siglaPartido;
	}

	public void setSiglaPartido(String siglaPartido) {
		this.siglaPartido = siglaPartido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	
	

}
