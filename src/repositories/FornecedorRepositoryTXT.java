package repositories;

import java.io.PrintWriter;

import entities.Fornecedor;
import entities.Produto;
import interfaces.IFornecedorRepository;

public class FornecedorRepositoryTXT implements IFornecedorRepository{
	
	@Override
	public void exportar(Fornecedor fornecedor) throws Exception {
		// TODO Auto-generated method stub
		
		//Dados do fornecedor
		PrintWriter printWriter = new PrintWriter("c:\\clientes\\fornecedor.txt");
		
		printWriter.write("\nId do fornecedor...: " + fornecedor.getIdFornecedor());
		printWriter.write("\nNome...: " + fornecedor.getNome());
		printWriter.write("\nCnpj...: " + fornecedor.getCnpj());
	
		//foreach (para cada..)
		for(Produto produto : fornecedor.getProdutos()) {
					
			printWriter.write("\n\tId do produto...: " + produto.getIdProduto());
			printWriter.write("\n\tNome............: " + produto.getNome());
			printWriter.write("\n\tPreço...........: " + produto.getPreco());
			printWriter.write("\n\tQuantidade......: " + produto.getQuantidade());
	
	}

		printWriter.flush(); //salvar o arquivo
		printWriter.close(); //fechar o arquivo
	
	}
}
