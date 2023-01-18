package repositories;

import java.io.PrintWriter;

import entities.Fornecedor;
import entities.Produto;
import interfaces.IFornecedorRepository;

public class FornecedorRepositoryCSV implements IFornecedorRepository{

	@Override
	public void exportar(Fornecedor fornecedor) throws Exception {
		
		PrintWriter printWriter = new PrintWriter("c:\\clientes\\fornecedor.csv");
		
		printWriter.write(fornecedor.getIdFornecedor() + ";" + fornecedor.getNome() + ";" + fornecedor.getCnpj());
		
		for(Produto produto : fornecedor.getProdutos()) {
			printWriter.write("\n" + produto.getIdProduto() + ";" + produto.getNome() + ";" + produto.getPreco() + ";" + produto.getQuantidade());
		}
		
		printWriter.flush();
		printWriter.close();
	}

}

		
	
