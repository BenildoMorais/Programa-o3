package Aula21092022;

public class Clientes {
	
	private int numeroConta;
	private String nome;
	private String morada;
	private int telefone;
	private String tipoConta;
	private String genero;
	
	public Clientes(int numeroConta, String nome, String morada, int telefone, String tipoConta, String genero) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.morada = morada;
		this.telefone = telefone;
		this.tipoConta = tipoConta;
		this.genero = genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public void setMorada(String morada) {
		this.morada = morada;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public String getMorada() {
		return morada;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public String getTipoConta() {
		return tipoConta;
	}
	
	@Override
	public String toString() {
		return this.nome+" "+this.morada+" "+this.telefone+" "+this.tipoConta;
	}
}
