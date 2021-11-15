package pkgexpoo;

import java.text.NumberFormat;

public class ex04_Funcionario {
	
	private int id;
	private String nome;
	private String email;
	private String setor;
	private double salario;
	private int horasTrabalhadasMensais = 220;
	
	public ex04_Funcionario(int id, String nome, String email, String setor, double salario) {
		
		this.setId(id);
		this.setNome(nome);
		this.setEmail(email);
		this.setSetor(setor);
		this.setSalario(salario);
	}
	
	
	public void horasExtras(double hrsE) {
		
		
		salario = (salario/horasTrabalhadasMensais)*hrsE+salario;
		//salario/=horasTrabalhadasMensais*hrsE+salario;
	}
	
	public String formatarMoeda() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);		
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	public void imprimirDados() {
		System.out.println("\n\t\t***** Dados do Funcionário *****\nNúmero do Cartão: " + id + "\nNome do Funcionário: " + nome
				+ "\nE-mail: " + email + "\nSetor: " + setor + "\nSalário do mês atual: " + this.formatarMoeda());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
