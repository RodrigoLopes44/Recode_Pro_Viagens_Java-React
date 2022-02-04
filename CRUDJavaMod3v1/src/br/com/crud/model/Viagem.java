package br.com.crud.model;

public class Viagem {

	private int id_viagem;
	private String dataIda, dataVolta;
	private Cliente cliente;
	private Local local;
	private int id_cli;
	private int id_local;
	
	public int getId_viagem() {
		return id_viagem;
	}
	public void setId_viagem(int id_viagem) {
		this.id_viagem = id_viagem;
	}
	public String getDataIda() {
		return dataIda;
	}
	public void setDataIda(String dataIda) {
		this.dataIda = dataIda;
	}
	public String getDataVolta() {
		return dataVolta;
	}
	public void setDataVolta(String dataVolta) {
		this.dataVolta = dataVolta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public int getId_cli() {
		return id_cli;
	}
	public void setId_cli(int id_cli) {
		this.id_cli = id_cli;
	}
	public int getId_local() {
		return id_local;
	}
	public void setId_local(int id_local) {
		this.id_local = id_local;
	}	
}
