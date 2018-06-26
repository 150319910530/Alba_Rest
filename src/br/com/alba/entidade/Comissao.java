package br.com.alba.entidade;


public class Comissao {
	
	private int idComissao;
	private String idComissaoSuperior;
	private String tipoComissao;
	private String nomeComissao;
	private int ativo;
	private String dataCriacao;
	private String dataAtualizacao;
	
	public Comissao() {
		
	}

	public int getIdComissao() {
		return idComissao;
	}

	public void setIdComissao(int idComissao) {
		this.idComissao = idComissao;
	}

	public String getIdComissaoSuperior() {
		return idComissaoSuperior;
	}

	public void setIdComissaoSuperior(String idComissaoSuperior) {
		this.idComissaoSuperior = idComissaoSuperior;
	}

	public String getTipoComissao() {
		return tipoComissao;
	}

	public void setTipoComissao(String tipoComissao) {
		this.tipoComissao = tipoComissao;
	}

	public String getNomeComissao() {
		return nomeComissao;
	}

	public void setNomeComissao(String nomeComissao) {
		this.nomeComissao = nomeComissao;
	}

	public int getAtivo() {
		return ativo;
	}

	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(String dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	
	

}
