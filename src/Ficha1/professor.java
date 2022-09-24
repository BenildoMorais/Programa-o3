package Ficha1;

public class professor extends funcionario{

	professor(String nome) {
		super(nome);
	}
	
	public void setsalario(double salario) {
		if(salario<0) {
			throw new IllegalArgumentException("O salario nao pode ser menor que zero");
		}else {
		this.salario=salario;
		}
	}
	
	public double getsalario() {
		return this.salario;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getnome(String nome) {
		return this.nome;
	}
	
}
