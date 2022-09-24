package Ficha1;

public class veiculo {
	protected String marca;
	protected String cor;
	
	veiculo(String marca, String cor){
		this.setMarca(marca);
		this.setCor(cor);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}


	
	

}
