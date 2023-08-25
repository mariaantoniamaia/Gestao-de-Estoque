package controle;

import modelo.Produto;
import visao.Janela;

public class App {

	public static void main(String[] args) {
		
		Janela visaoJanela = new Janela();
		visaoJanela.setVisible(true);
		
		Produto modeloProduto = new Produto();
		
		ProdutoControle daoProduto = new ProdutoControle(visaoJanela, modeloProduto); //chamar com parâmetros
		
	}
	
}
