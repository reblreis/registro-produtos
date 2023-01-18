package principal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entities.Fornecedor;
import entities.Produto;
import interfaces.IFornecedorRepository;
import repositories.FornecedorRepositoryCSV;
import repositories.FornecedorRepositoryTXT;

public class Program {

	public static void main(String[] args) {

		// CLASSE OBJETO [INICIALIZANDO / INSTANCIANDO]

		// criando um objeto Fornecedor
		Fornecedor fornecedor = new Fornecedor(); // evitar abreviações
		// = new Fornecedor = construtor
		// Objeto = variável de instância

		// criando objetos da classe produto
		Produto produto1 = new Produto(1, "Notebook Dell", 5000.0, 10);
		Produto produto2 = new Produto(2, "Mouse Optico", 90.0, 20);
		Produto produto3 = new Produto(3, "Impressora Laser", 500.0, 15);
		Produto produto4 = new Produto(4, "Teclado sem fio", 150.0, 10);

		// criando uma lista de produtos
		List<Produto> produtos = new ArrayList<Produto>();

		// adicionando os produtos dentro da lista
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);

		// adicionando a lista de produtos no fornecedor
		fornecedor.setProdutos(produtos);

	

	// interface será um protótipo de como a classe vai funcionar
	// interface = criar padrão
	// Override = sobescrita de métodos
	// Override = implementa
	// método abstrato

	// criando um polimorfismo da interface

	IFornecedorRepository fornecedorRepository = null; // vazio

	String opcao = JOptionPane.showInputDialog("Informe CSV ou TXT:");

	switch(opcao.toUpperCase()) {
	
	
	case "TXT":
		//POLIMORFISMO
		fornecedorRepository = new FornecedorRepositoryTXT(); 
		break;
		
	case "CSV":
		//POLIMORFISMO
		fornecedorRepository = new FornecedorRepositoryCSV(); 
		break;	
	}

	try
	{
		fornecedorRepository.exportar(fornecedor);
		System.out.println("Dados gravados com sucesso!");
	}catch(
	Exception e)
	{
		System.out.println("Erro: " + e.getMessage());
	}
}

}
