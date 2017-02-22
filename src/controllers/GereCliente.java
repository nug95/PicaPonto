package controllers;

import java.util.ArrayList;

import model.Cliente;

public class GereCliente {
	ArrayList<Cliente> arClientes;
	
	public GereCliente(){
		arClientes = new ArrayList<>();
	}
	
	public void addCliente(String username, String primeiro_nome, String ultimo_nome, String morada, String contacto,
			int cargo, boolean deleted, int numCartao){
		Cliente c = new Cliente(arClientes.size(), username, primeiro_nome, ultimo_nome, morada, contacto, cargo, deleted, numCartao);
		arClientes.add(c);
	}
	
	public void delCliente(Cliente cli){
		arClientes.remove(cli);
	}
}
