package pkgexpoo;

public class ex01_TesteCliente_Main {

	public static void main(String[] args) {
		
		ex01_Cliente[] cliente = new ex01_Cliente[2];
		
		cliente[0] = new ex01_Cliente(123633068, "Lucas Diniz", "Avenida Santo Amaro", 
				"Vila das Belezas", 849, 0443012, 40028922, "AB+");
		
		cliente[1] = new ex01_Cliente(1248933068, "José Paulo", "Jardim Apura", 
				"Grajaú", 21, 0443012, 48528232, "O-");
		
		for(ex01_Cliente roda: cliente) {
			roda.cadastroCliente();
		}
	}

}
