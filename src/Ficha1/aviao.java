package Ficha1;

public class aviao extends veiculo {
	
	protected String Status;

	aviao(String marca, String cor) {
		super(marca, cor);
		
	}
	
	public void decolar() {
		this.Status = "voando";
	}

	public void aterar() {
		this.Status = "parado";
	}
}
