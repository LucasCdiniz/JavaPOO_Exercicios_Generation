package pkgexpoo;

public class ex02_TesteAviao_Main {

	public static void main(String[] args) {
		
		ex02_Aviao[] dadosViagem = new ex02_Aviao[2];
		
		dadosViagem[0] = new ex02_Aviao(144489875,"Lucas Diniz","2.245 horas","Avião Miura","Modelo 159",
				"Londres - Piracicaba","9 horas","7","5 kg","204 Km/h");
		
		dadosViagem[1] = new ex02_Aviao(198723475,"Marcio Gaúcho","4.500 horas","Avião Sampa","Modelo 777",
				"Santo Amaro - Avenida Paulista","13 horas","115","45 kg","60 Km/h");
		
		for(ex02_Aviao roda:dadosViagem ) {
			roda.dadosPiloto();
			roda.dadosAeronave();
			roda.detalhesRota();
		}
		
	}

}
