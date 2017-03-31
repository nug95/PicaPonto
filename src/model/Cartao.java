package model;

public class Cartao {
	private int 	id;
	private String	numCartao;
	private String	cliente;
	
	public Cartao(String numCartao, String cliente) {
		super();
		this.numCartao = numCartao;
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
}
