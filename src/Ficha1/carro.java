package Ficha1;

public class carro extends veiculo {
	protected String tipo;

	carro(String marca, String cor, String tipo) {
		super(marca, cor);
		this.tipo=tipo;
	}

	public void bosinar() {
		System.out.println("Pimmmmmmmmmmm");
	}
		
}
