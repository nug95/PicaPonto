package controller;

import java.util.ArrayList;

import model.Cliente;

public class GereCliente {
	ArrayList<Cliente> arCliente;
	
	public GereCliente(){
		this.arCliente = new ArrayList<Cliente>();
	}

	public ArrayList<Cliente> getArCliente() { return arCliente; }
	public void setArCliente(ArrayList<Cliente> arCliente) { this.arCliente = arCliente; }
	
	public void addCliente(String username, String primeiro_nome, String ultimo_nome, String morada, String contacto){
		Cliente c = new Cliente(username, primeiro_nome, ultimo_nome, morada, contacto);
		int novoID = arCliente.size();
		c.setId(novoID);
		arCliente.add(c);
	}
}
