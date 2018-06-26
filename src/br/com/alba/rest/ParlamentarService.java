package br.com.alba.rest;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.alba.dao.ParlamentarDAO;
import br.com.alba.entidade.Parlamentar;

@Path("/parlamentar")
public class ParlamentarService {
	
private ParlamentarDAO parlamentarDAO;
	
	@PostConstruct
	private void init() {
		
		parlamentarDAO = new ParlamentarDAO();
		
	}
	
	@GET
	@Path("/listaparlamentar")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Parlamentar> listarParlamentar() {
		List<Parlamentar> listapar = null;
		try {
			listapar = parlamentarDAO.listarParlamentar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listapar;
	}

}
