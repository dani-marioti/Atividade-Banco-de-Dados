package atividade;

public class Locador {
	private int id;
	private int cpf;
	private String nome;
	private int telefone;
	
	public Locador() { }
	
	public Locador(int id, int cpf, String nome, int telefone) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getCPF() {
		return cpf;
	}

	public void setCPF(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	@Override
	public String toString() {
		return "Locador [id=" + id + ",cpf=" + cpf + ", nome=" + nome + ", teledone=" + telefone + "]";
	}	
	
}