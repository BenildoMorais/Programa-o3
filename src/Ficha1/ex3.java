package Ficha1;

public class ex3 {
	public static void main(String[] args) {
		
	alunoTrabalhador t1 = new alunoTrabalhador("joao");
	t1.setHorasTrabalhadas(1000);
	System.out.println(t1.getsalario()+"Mt");
	
	professor p1 = new professor("alberto");
	p1.setsalario(-56445);
	}
}
