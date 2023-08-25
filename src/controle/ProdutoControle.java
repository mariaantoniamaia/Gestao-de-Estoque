package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.ProdutoDAO;
import modelo.Produto;
import visao.Janela;

public class ProdutoControle implements ActionListener {

	//variáveis auxiliares
	private Janela j;
	private Produto p;
	private ProdutoDAO pd;

	//construtor sem DAO + dar ação aos botões
	public ProdutoControle(Janela j, Produto p) {
		super();
		this.j = j;
		this.p = p;

		this.pd = new ProdutoDAO();

		j.getButtonSalvar().addActionListener(this);
		j.getButtonNovo().addActionListener(this);

	}

	public void cadastraProduto() {
		String codigo = j.getTextCodigo().getText();
		String produto = j.getTextProduto().getText();
		String peso = j.getTextPeso().getText();
		String precoCompra = j.getTextPrecoCompra().getText();
		String precoVenda = j.getTextPrecoVenda().getText();
		String fornecedor = j.getComboBoxFornecedor().getSelectedItem().toString();
		String observacao =  j.getTextArea().getText();
		
		p.setCodigo(codigo);
		p.setProduto(produto);
		p.setPeso(peso);
		p.setPrecoCompra(precoCompra);
		p.setPrecoVenda(precoVenda);
		p.setFornecedor(fornecedor);
		p.setObservacao(observacao);

		if(p.validaCampos().size()> 0)
		{
			System.out.println("O(s) campo(s) "+p.validaCampos()+ " está/estão em branco.");
		}
		else
		{
			if(pd.cadastraProduto(p))
			{
				System.out.println("Cadastro de produto realizado.");
			}
				
			else
			{
				System.out.println("Erro ao cadastrar o produto.");
			}
				
		}
		
	}

	//definir a ação dos botões
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Salvar")) {
			cadastraProduto();
			
		}
		else if (e.getActionCommand().equals("Novo")) {
			j.limpaTela();
		}
	}

}
