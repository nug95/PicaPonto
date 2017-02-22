package model;

public class Cliente {
	int id;
	String  username,
			primeiro_nome,
			ultimo_nome,
			morada,
			contacto;
	int cargo;
	boolean deleted;
	int numCartao;
	
	
	public Cliente(int id, String username, String primeiro_nome, String ultimo_nome, String morada, String contacto,
			int cargo, boolean deleted, int numCartao) {
		super();
		this.id = id;
		this.username = username;
		this.primeiro_nome = primeiro_nome;
		this.ultimo_nome = ultimo_nome;
		this.morada = morada;
		this.contacto = contacto;
		this.cargo = cargo;
		this.deleted = deleted;
		this.numCartao = numCartao;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPrimeiro_nome() {
		return primeiro_nome;
	}


	public void setPrimeiro_nome(String primeiro_nome) {
		this.primeiro_nome = primeiro_nome;
	}


	public String getUltimo_nome() {
		return ultimo_nome;
	}


	public void setUltimo_nome(String ultimo_nome) {
		this.ultimo_nome = ultimo_nome;
	}


	public String getMorada() {
		return morada;
	}


	public void setMorada(String morada) {
		this.morada = morada;
	}


	public String getContacto() {
		return contacto;
	}


	public void setContacto(String contacto) {
		this.contacto = contacto;
	}


	public int getCargo() {
		return cargo;
	}


	public void setCargo(int cargo) {
		this.cargo = cargo;
	}


	public boolean isDeleted() {
		return deleted;
	}


	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}


	public int getNumCartao() {
		return numCartao;
	}


	public void setNumCartao(int numCartao) {
		this.numCartao = numCartao;
	}
	
}
