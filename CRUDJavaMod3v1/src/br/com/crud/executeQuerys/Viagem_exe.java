package br.com.crud.executeQuerys;

import br.com.crud.dao.ViagemDAO;
import br.com.crud.model.Viagem;

public class Viagem_exe {

	public static void main(String[] args) {

		ViagemDAO viagemDAO = new ViagemDAO();
		/*
		 * Viagem viagem = new Viagem();
		 * 
		 * viagem.setId_viagem(2); 
		 * viagem.setDataIda("21/02/2022");
		 * viagem.setDataVolta("05/03/2022"); 
		 * viagem.setId_cli(1);
		 * viagem.setId_local(3);
		 * 
		 * viagemDAO.save(viagem);
		 */
		
		for (Viagem v : viagemDAO.getViagens()) {
			System.out.println("O cliente: " + v.getCliente().getNome() + " viajará para: " + v.getLocal().getCidade() + ", " + v.getLocal().getEstado() + ". Do dia " + v.getDataIda() + " até " + v.getDataVolta() + "\n");
		}
	}
}