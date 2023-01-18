package entities;

import java.util.List;

public class Fornecedor {
	//ATRIBUTOS
	private Integer idFornecedor;
	private String nome;
	private String cnpj;
	private List<Produto> produtos;
	
	
	//CONSTRUTOR é público = o nome do construtor é igual da classe
	public Fornecedor() { //sem entrada de argumentos
		// TODO Auto-generated constructor stub
	}
	
	//usar o construtor com atributos preenchidos pra cadastrar algo (por exemplo, um produto) e usar os sets pra atualizar um produto já existente.
	
	public Fornecedor(Integer idFornecedor, String nome, String cnpj) { //com entrada de argumentos
		this.idFornecedor = idFornecedor;
		this.nome = nome;
		this.cnpj = cnpj;
	}
						
	public Fornecedor(Integer idFornecedor, String nome, String cnpj, List<Produto> produtos) {
		super();
		this.idFornecedor = idFornecedor;
		this.nome = nome;
		this.cnpj = cnpj;
		this.produtos = produtos;
	}

	public Integer getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(Integer idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
