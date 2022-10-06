package Aula03102022;

public class Producto {

	private int numero;
	private String referencia;
	private String descricao;
	private Double lucro;
	private Double venda;
	
	public Producto(int numero, String referencia, String descricao, Double lucro, Double venda) {
		this.numero = numero;
		this.referencia = referencia;
		this.descricao = descricao;
		this.lucro = lucro;
		this.venda = venda;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getLucro() {
		return lucro;
	}

	public void setLucro(Double lucro) {
		this.lucro = lucro;
	}

	public Double getVenda() {
		return venda;
	}

	public void setVenda(Double venda) {
		this.venda = venda;
	}
	
	public String  toString() {
		return this.numero+" "+this.referencia+" "+this.descricao+" "+this.lucro+" "+this.venda+" ";
	}
	
}
