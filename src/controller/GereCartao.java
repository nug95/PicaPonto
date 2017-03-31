package controller;

import java.util.ArrayList;

import model.Cartao;

public class GereCartao {
	ArrayList<Cartao> arCartao;
	
	public GereCartao(){
		this.arCartao = new ArrayList<Cartao>();
	}

	public ArrayList<Cartao> getArCartao() { return arCartao; }
	public void setArCartao(ArrayList<Cartao> arCartao) { this.arCartao = arCartao; }
	
	public void addCartao(int numCartao, String cliente){
		Cartao c = new Cartao(numCartao, cliente);
		int novoID = arCartao.size();
		c.setId(novoID);
		arCartao.add(c);
	}
}
