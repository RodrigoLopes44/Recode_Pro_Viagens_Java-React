package br.com.crud.executeQuerys;

import br.com.crud.dao.LocalDAO;
import br.com.crud.model.Local;

public class Local_exe {

	public static void main(String[] args) {
		LocalDAO localDAO = new LocalDAO();
		
		/*
		Local local = new Local();
		local.setId_local(1);
		local.setCidade("Rio de Janeiro");
		local.setEstado("Rio de Janeiro");
		localDAO.save(local);
				// ------------ //
		
		
		local.setId_local(3);
		local.setCidade("Barbacena");
		local.setEstado("Minas Gerais");
		localDAO.save(local);
		*/
		for (Local l : localDAO.getLocais()) {			
			System.out.println("Id do local: " + l.getId_local() + "\nCidade: " + l.getCidade() + "\nEstado: " + l.getEstado()+"\n");			
		}
	}
}