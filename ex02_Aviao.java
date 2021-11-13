package pkgexpoo;

public class ex02_Aviao {

	
	private long rab;
	private String nomePiloto;
	private String horasVooPiloto;
	private String tipoAeronave;
	private String modeloAeronave;
	private String rota;
	private String horasVooAteDestino;
	private String capacidadePassageiros;
	private String capacidadeBagagem;
	private String velocidade;
	
	public ex02_Aviao(long rab, String nomePiloto, String horasVooPiloto, String tipoAeronave, String modeloAeronave,
			String rota, String horasVooAteDestino, String capacidadePassageiros, String capacidadeBagagem, String velocidade) {
		
		this.setRab(rab);
		this.setNomePiloto(nomePiloto);
		this.setHorasVooPiloto(horasVooPiloto);
		this.setTipoAeronave(tipoAeronave);
		this.setModeloAeronave(modeloAeronave);
		this.setRota(rota);
		this.setHorasVooAteDestino(horasVooAteDestino);
		this.setCapacidadePassageiros(capacidadePassageiros);
		this.setCapacidadeBagagem(capacidadeBagagem);
		this.setVelocidade(velocidade);
		
	}
	
	
	public void dadosPiloto() {
		System.out.println("\n\t\t***Dados dos Piloto***\nNome do piloto: " + nomePiloto + 
				"\nQuantidade de horas/voo do piloto: " + horasVooPiloto);
	}
	
	public void dadosAeronave() {
		System.out.println("\n\t\t***Dados da Aeronave***\nRegistro Aeronáutico Brasileiro: " + rab + "\nTipo de Aeronave escolhida: "
				+tipoAeronave + "\nModelo da Aeronave: " + modeloAeronave + "\nCapacidade de passageiros da aeronave: " + capacidadePassageiros + " pessoas"
				+ "\nCapacidade de bagagem: " + capacidadeBagagem + "\nVelocidade máxima: " + velocidade);
	}
	
	public void detalhesRota() {
		System.out.println("\n\t\t***Dados da Rota***\nRota Escolhida: " + rota + "\nHoras para a chegada até o destino: " + horasVooAteDestino);
	}
	
	
	public long getRab() {
		return rab;
	}
	public void setRab(long rab) {
		this.rab = rab;
	}
	public String getNomePiloto() {
		return nomePiloto;
	}
	public void setNomePiloto(String nomePiloto) {
		this.nomePiloto = nomePiloto;
	}
	public String getHorasVooPiloto() {
		return horasVooPiloto;
	}
	public void setHorasVooPiloto(String horasVooPiloto) {
		this.horasVooPiloto = horasVooPiloto;
	}
	public String getTipoAeronave() {
		return tipoAeronave;
	}
	public void setTipoAeronave(String tipoAeronave) {
		this.tipoAeronave = tipoAeronave;
	}
	public String getRota() {
		return rota;
	}
	public void setRota(String rota) {
		this.rota = rota;
	}
	public String getHorasVooAteDestino() {
		return horasVooAteDestino;
	}
	public void setHorasVooAteDestino(String horasVooAteDestino) {
		this.horasVooAteDestino = horasVooAteDestino;
	}
	public String getCapacidadePassageiros() {
		return capacidadePassageiros;
	}
	public void setCapacidadePassageiros(String capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}
	public String getCapacidadeBagagem() {
		return capacidadeBagagem;
	}
	public void setCapacidadeBagagem(String capacidadeBagagem) {
		this.capacidadeBagagem = capacidadeBagagem;
	}
	public String getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}


	public String getModeloAeronave() {
		return modeloAeronave;
	}


	public void setModeloAeronave(String modeloAeronave) {
		this.modeloAeronave = modeloAeronave;
	}
	
	
	
}
