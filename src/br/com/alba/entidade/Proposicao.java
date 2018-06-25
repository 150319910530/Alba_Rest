package br.com.alba.entidade;

import java.util.Date;

public class Proposicao {
	
	private int idProposicao;
	private String numeroProposicao;
	private Date dateProposicao;
	private String ementaProposicao;
	
	public Proposicao() {
		
	}

	public int getIdProposicao() {
		return idProposicao;
	}

	public void setIdProposicao(int idProposicao) {
		this.idProposicao = idProposicao;
	}

	public String getNumeroProposicao() {
		return numeroProposicao;
	}

	public void setNumeroProposicao(String numeroProposicao) {
		this.numeroProposicao = numeroProposicao;
	}

	public Date getDateProposicao() {
		return dateProposicao;
	}

	public void setDateProposicao(Date dateProposicao) {
		this.dateProposicao = dateProposicao;
	}

	public String getEmentaProposicao() {
		return ementaProposicao;
	}

	public void setEmentaProposicao(String ementaProposicao) {
		this.ementaProposicao = ementaProposicao;
	}
	
	
	
}

	
	
