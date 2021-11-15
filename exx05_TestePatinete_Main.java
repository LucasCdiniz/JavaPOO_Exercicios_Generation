package pkgexpoo;

public class exx05_TestePatinete_Main {

	public static void main(String[] args) {
		
		ex05_Patinete[] patinete = new ex05_Patinete[2];
		
		patinete[0] = new ex05_Patinete("Dm Toys","A partir de 5 anos", "Até 60 kg","Sim",
				"11,8 cm (diantera) e 10 cm (traseira)", "Não","Freio traseiro, luzes nas rodas e cestinha","Não");
		
		patinete[1] = new ex05_Patinete("DTC","A partir de 3 anos", "Até 80 kg","Sim",
				"12 cm (diantera) e 8 cm (traseira)", "Sim","Freio traseiro","Sim");
		
		for(ex05_Patinete roda: patinete) {
			roda.imprimirDados();
		}
		
	}

}
