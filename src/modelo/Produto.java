package modelo;

import java.util.ArrayList;
import java.util.List;

public class Produto {

	private String codigo;
	private String produto;
	private String peso;
	private String precoCompra;
	private String precoVenda;
	private String fornecedor;
	private String observacao;
	
	//construtor
	public Produto(String codigo, String produto, String peso, String precoCompra, String precoVenda,
			String fornecedor, String observacao) {
		super();
		this.codigo = codigo;
		this.produto = produto;
		this.peso = peso;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
		this.fornecedor = fornecedor;
		this.observacao = observacao;
	}
	
	//construtor vazio
	public Produto() {
		super();
	}

	//getters e setters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(String precoCompra) {
		this.precoCompra = precoCompra;
	}

	public String getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(String precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	//valida campos
	public List<String> validaCampos() {
		
		ArrayList<String> lista = new ArrayList<String>();
		
		if(codigo.equals(""))
			lista.add("Código");
		if(produto.equals(""))
			lista.add("Produto");
		if(peso.equals(""))
			lista.add("Peso");
		if(precoCompra.equals(""))
			lista.add("Preço de Compra");
		if(precoVenda.equals(""))
			lista.add("Preço de Venda");
		if(fornecedor.equals(""))
			lista.add("Fornecedor");
		
		return lista;
	}
	
	//toString para organizar o que vai para o arquivo
	@Override
	public String toString() {
		return codigo + "#" + produto + "#" + peso + "#" + precoCompra + "#" + precoVenda + "#" + fornecedor + "#" + observacao;
	}
	
	
	
}
