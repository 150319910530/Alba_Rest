package br.com.alba.rest;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.alba.dao.ComissaoDAO;
import br.com.alba.entidade.Comissao;


@Path("/comissao")
public class ComissaoService {
	
	private ComissaoDAO comissaoDAO;
	
	@PostConstruct
	private void init() {
		
		comissaoDAO = new ComissaoDAO();
		
	}
	
	@GET
	@Path("/comissaoativa")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Comissao> listarNotas() {
		List<Comissao> listacom = null;
		try {
			listacom = comissaoDAO.listarProposicao();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listacom;
	}

}
