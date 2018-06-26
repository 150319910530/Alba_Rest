package br.com.alba.rest;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.alba.dao.ProposicaoDAO;
import br.com.alba.entidade.Proposicao;

@Path("/proposicao")
public class ProposicaoService {
		
		private ProposicaoDAO proposicaoDAO;
		
		@PostConstruct
		private void init() {
			
			proposicaoDAO = new ProposicaoDAO();
			
		}
		
		@GET
		@Path("/UltimaProposicoes")
		@Produces(MediaType.APPLICATION_JSON)
		public List<Proposicao> listarProposicao() {
			List<Proposicao> listapp = null;
			try {
				listapp = proposicaoDAO.listarProposicao();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return listapp;
		}


}
