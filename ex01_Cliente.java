package pkgexpoo;

public class ex01_Cliente {
	
	private int identificacaoCpfCnpj;
	private String nome;
	private String endereco;
	private String bairro;
	private int numero;
	private int cep;
	private int telefone;
	private String tipoSanguineo;
	
	public ex01_Cliente(int identificacaoCpfCnpj, String nome, String endereco, String bairro, int numero, int cep, 
			int telefone, String tipoSanguineo) 
	
	{
		this.setIdentificacaoCpfCnpj(identificacaoCpfCnpj);
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setBairro(bairro);
		this.setNumero(numero);
		this.setCep(cep);
		this.setTelefone(telefone);
		this.setTipoSanguineo(tipoSanguineo);
		
	}
	
	public void cadastroCliente() {
		System.out.println("\n\t\t****Cadastro de Clientes****\n"+ "Nome: " + nome + "\nCPF/CNPJ: " + identificacaoCpfCnpj +
				"\nEndereço: " + endereco + "\nBairro: " + bairro + "\nNúmero: "+ numero + "\nCEP: " + cep + 
				"\nTelefone: " + telefone + "\nTipo Sanquíneo: " + tipoSanguineo);
	}
	

	public int getIdentificacaoCpfCnpj() {
		return identificacaoCpfCnpj;
	}

	public void setIdentificacaoCpfCnpj(int identificacaoCpfCnpj) {
		this.identificacaoCpfCnpj = identificacaoCpfCnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	
	

}
