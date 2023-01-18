package interfaces;

import entities.Fornecedor;

public interface IFornecedorRepository {

	// Método abstrato que não possue corpo somente assinatura
	// Toda interface é publica
	/*
	 * Método abstrato
	 * Consiste de um método que não possui corpo, apenas assinatura
	 * Quando uma classe implementar esta interface, a classe deverá
	 * fornecer corpo para todos os métodos abstratos da interface
	 */

	
	void exportar(Fornecedor fornecedor) throws Exception;
	
	

	
}
