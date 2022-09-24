package Ficha1;

public class alunoTrabalhador extends funcionario{

	private int horasTrabalhadas;
	final private int salarioHora = 500; 
	
	alunoTrabalhador(String nome) {
		super(nome);
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		if(horasTrabalhadas<0 || horasTrabalhadas>160) {
			throw new IllegalArgumentException("as horas nao podem ser negativas nem superiores que 160");
		}
		else {
			this.horasTrabalhadas = horasTrabalhadas;
			this.salario = this.horasTrabalhadas*salarioHora;
		}
	}
	
	public double getsalario() {
		return this.salario;
	}
	
	

}
