package pkgexpoo;

import java.text.NumberFormat;

public class ex03_ProdutoEletronico {

	private String marca;
	private String modeloCelular;
	private String so;
	private String memoriaIntena;
	private float preco;
	
	public ex03_ProdutoEletronico(String marca, String modeloCelular, String so, String memoriaInterna, float preco) {
		
		this.setMarca(marca);
		this.setModeloCelular(modeloCelular);
		this.setSo(so);
		this.setMemoriaIntena(memoriaInterna);
		this.setPreco(preco);
		
	}
	
	public String formatarMoeda() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);		
		String formatoMoeda = nf.format(preco);
		return formatoMoeda;
	}
	
	public void impressaoDados() {
		System.out.println("\n\t\t***Ficha Técnica***\nMarca: " + marca + "\nModelo do Celular: " + modeloCelular+
				"\nSistema Operacional: " + so + "\nMemória interna: " + memoriaIntena + "\nPreço: " + this.formatarMoeda());
	}
	
	public void descontarValor(float descontoPercentual) {
		preco*=1-descontoPercentual/100;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModeloCelular() {
		return modeloCelular;
	}

	public void setModeloCelular(String modeloCelular) {
		this.modeloCelular = modeloCelular;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public String getMemoriaIntena() {
		return memoriaIntena;
	}

	public void setMemoriaIntena(String memoriaIntena) {
		this.memoriaIntena = memoriaIntena;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
	
}
