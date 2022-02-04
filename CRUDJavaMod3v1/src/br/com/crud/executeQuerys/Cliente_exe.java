package br.com.crud.executeQuerys;

import br.com.crud.dao.*;
import br.com.crud.model.*;

public class Cliente_exe {

	public static void main(String[] args) {
		ClienteDAO clienteDAO = new ClienteDAO();
		/*
		Cliente cliente = new Cliente();
		cliente.setId_cli(3);
		cliente.setNome("Josue");
		cliente.setCpf("222.333.444-55");
		clienteDAO.save(cliente);	
		*/
		
		for (Cliente c : clienteDAO.getClientes()) {			
			System.out.println("Id do cliente: " + c.getId_cli() + "\nNome: " + c.getNome() + "\nCPF: " + c.getCpf() + "\n");			
		}		
	}
}
