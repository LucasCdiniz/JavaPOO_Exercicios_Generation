package pkgexpoo;

public class ex04_TesteFuncionario_Main {

	public static void main(String[] args) {
		
		ex04_Funcionario[] func = new ex04_Funcionario[2];
		
		func[0] = new ex04_Funcionario(123,"Lucas","lucas@email.com","Desenvolvimento",3000);
		func[1] = new ex04_Funcionario(357,"Jorge Henrique","jh@email.com","Financeiro",5000);
		
		for(ex04_Funcionario roda: func) {
			roda.imprimirDados();
		}
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		
		System.out.println("\nDados dos funcionários com horas extra");
		
		for(ex04_Funcionario roda: func) {
			roda.horasExtras(3);
			roda.imprimirDados();
		}
	}

}
