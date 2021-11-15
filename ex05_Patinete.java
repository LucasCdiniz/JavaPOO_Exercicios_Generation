package pkgexpoo;

public class ex05_Patinete {

	private String modelo;
	private String indicaçãoDeIdade;
	private String pesoMax;
	private String guidaoRegulavel;
	private String diametroDaRoda;
	private String dobravel;
	private String recursosExtras;
	private String seloInmetro;
	
	public ex05_Patinete(String modelo, String indicacaoDeIdade, String pesoMax, String guidaoRegulavel, 
			String diametroDaRoda, String dobravel,String recursosExtras, String seloInmetro) 
	{
		this.setModelo(modelo);
		this.setIndicaçãoDeIdade(indicacaoDeIdade);
		this.setPesoMax(pesoMax);
		this.setGuidaoRegulavel(guidaoRegulavel);
		this.setDiametroDaRoda(diametroDaRoda);
		this.setDobravel(dobravel);
		this.setRecursosExtras(recursosExtras);
		this.setSeloInmetro(seloInmetro);		
	}
	
	
	public void imprimirDados() {
		System.out.println("\n\t\t***** Ficha técnica do Patinete *****\nModelo: " + modelo + "\nIdade indicada: " + indicaçãoDeIdade
				+ "\nPeso suportado: " + pesoMax + "\nGuidão Ajustável: " + guidaoRegulavel + "\nRodas: " + diametroDaRoda 
				+ "\nDobrável: " + dobravel + "\nRecursos Extras: " + recursosExtras + "\nSelo INMETRO: " + seloInmetro);
	}
	
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getIndicaçãoDeIdade() {
		return indicaçãoDeIdade;
	}
	public void setIndicaçãoDeIdade(String indicaçãoDeIdade) {
		this.indicaçãoDeIdade = indicaçãoDeIdade;
	}
	public String getPesoMax() {
		return pesoMax;
	}
	public void setPesoMax(String pesoMax) {
		this.pesoMax = pesoMax;
	}
	public String getGuidaoRegulavel() {
		return guidaoRegulavel;
	}
	public void setGuidaoRegulavel(String guidaoRegulavel) {
		this.guidaoRegulavel = guidaoRegulavel;
	}
	public String getDiametroDaRoda() {
		return diametroDaRoda;
	}
	public void setDiametroDaRoda(String diametroDaRoda) {
		this.diametroDaRoda = diametroDaRoda;
	}
	public String getDobravel() {
		return dobravel;
	}
	public void setDobravel(String dobravel) {
		this.dobravel = dobravel;
	}
	public String getRecursosExtras() {
		return recursosExtras;
	}
	public void setRecursosExtras(String recursosExtras) {
		this.recursosExtras = recursosExtras;
	}
	public String getSeloInmetro() {
		return seloInmetro;
	}
	public void setSeloInmetro(String seloInmetro) {
		this.seloInmetro = seloInmetro;
	}
	
	
}
