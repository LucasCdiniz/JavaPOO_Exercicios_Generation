package pkgexpoo;

public class ex03_TesteProdutoEletronico_Main {

	public static void main(String[] args) {
		
		ex03_ProdutoEletronico[] prodElet = new ex03_ProdutoEletronico[2];
		
		prodElet[0] = new ex03_ProdutoEletronico("Xiaomi","MI 9T","Android","128 GB",3499);
		
		prodElet[1] = new ex03_ProdutoEletronico("Samsumg","J8 S","Android","128 GB",4599);
		
		for(ex03_ProdutoEletronico roda: prodElet) {
			
			roda.impressaoDados();
			
		}
		
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------");
		
		System.out.println("\n\t\t******** Valor com o Desconto ********");
		
		for(ex03_ProdutoEletronico roda: prodElet) {
			
			roda.descontarValor(10);
			roda.impressaoDados();
			
		}
	}

}
