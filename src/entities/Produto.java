package entities;

public class Produto {

	private Integer idProduto;
	private String nome;
	private Double preco;
	private Integer quantidade;
	private Fornecedor fornecedor;
	
	//melhor lugar para criar atributos
	
	
	public Produto() {
		
	}
	
	public Produto(Integer idProduto, String nome, Double preco, Integer quantidade) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
	}

	public Produto(Integer idProduto, String nome, Double preco, Integer quantidade, Fornecedor fornecedor) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.fornecedor = fornecedor;
	}

	public Integer getIdProduto() { //() sem entrada de argumentos
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

}
