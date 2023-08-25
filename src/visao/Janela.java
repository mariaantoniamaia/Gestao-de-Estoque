package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textProduto;
	private JTextField textPeso;
	private JTextField textPrecoCompra;
	private JTextField textPrecoVenda;
	private JComboBox<String> comboBoxFornecedor;
	private JButton buttonNovo;
	private JButton buttonSalvar;
	private JButton buttonEditar;
	private JButton buttonCancelar;
	private JTextArea textObservacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Janela() {
		setTitle("Gestão de Estoque");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel labelTitulo = new JLabel("Cadastro de Produtos");
		labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 22));
		labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(labelTitulo, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[grow][grow][grow,fill]", "[][][][][grow]"));
		
		JLabel labelCodigo = new JLabel("Código");
		labelCodigo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(labelCodigo, "flowx,cell 0 0");
		
		textCodigo = new JTextField();
		textCodigo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(textCodigo, "cell 0 0,growx");
		textCodigo.setColumns(10);
		
		JLabel labelProduto = new JLabel("Produto");
		labelProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(labelProduto, "flowx,cell 1 0");
		
		textProduto = new JTextField();
		textProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(textProduto, "cell 1 0,growx");
		textProduto.setColumns(10);
		
		JLabel labelPeso = new JLabel("Peso");
		labelPeso.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(labelPeso, "flowx,cell 2 0");
		
		textPeso = new JTextField();
		textPeso.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(textPeso, "cell 2 0,growx");
		textPeso.setColumns(10);
		
		JLabel labelPrecoCompra = new JLabel("Preço de compra");
		labelPrecoCompra.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(labelPrecoCompra, "flowx,cell 0 1");
		
		textPrecoCompra = new JTextField();
		textPrecoCompra.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(textPrecoCompra, "cell 0 1,growx");
		textPrecoCompra.setColumns(10);
		
		JLabel labelPrecoVenda = new JLabel("Preço de venda");
		labelPrecoVenda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(labelPrecoVenda, "flowx,cell 1 1");
		
		textPrecoVenda = new JTextField();
		textPrecoVenda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(textPrecoVenda, "cell 1 1,growx");
		textPrecoVenda.setColumns(10);
		
		JLabel labelFornecedor = new JLabel("Fornecedor");
		labelFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(labelFornecedor, "flowx,cell 2 1");
		
		comboBoxFornecedor = new JComboBox<String>();
		comboBoxFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(comboBoxFornecedor, "cell 2 1,growx");
		comboBoxFornecedor.addItem("");
		comboBoxFornecedor.addItem("Nacional");
		comboBoxFornecedor.addItem("Importado");
		
		buttonNovo = new JButton("Novo");
		buttonNovo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(buttonNovo, "flowx,cell 0 2,growx");
		
		buttonSalvar = new JButton("Salvar");
		buttonSalvar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(buttonSalvar, "cell 0 2,growx");
		
		buttonEditar = new JButton("Editar");
		buttonEditar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(buttonEditar, "flowx,cell 1 2,growx");
		
		buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(buttonCancelar, "cell 1 2");
		
		JLabel labelObservacao = new JLabel("Observação");
		labelObservacao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(labelObservacao, "cell 0 3");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		//não sabia se era pra deixar a scrollbar visível sempre ou apenas quando passasse do 
		//limite da área do texto, então deixei sempre visível
		panel.add(scrollPane, "cell 0 4 3 1,grow");
		
		textObservacao = new JTextArea();
		textObservacao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		scrollPane.setViewportView(textObservacao);
		
	}
	
	//getters e setters
	public JTextField getTextCodigo() {
		return textCodigo;
	}

	public void setTextCodigo(JTextField textCodigo) {
		this.textCodigo = textCodigo;
	}

	public JTextField getTextProduto() {
		return textProduto;
	}

	public void setTextProduto(JTextField textProduto) {
		this.textProduto = textProduto;
	}

	public JTextField getTextPeso() {
		return textPeso;
	}

	public void setTextPeso(JTextField textPeso) {
		this.textPeso = textPeso;
	}

	public JTextField getTextPrecoCompra() {
		return textPrecoCompra;
	}

	public void setTextPrecoCompra(JTextField textPrecoCompra) {
		this.textPrecoCompra = textPrecoCompra;
	}

	public JTextField getTextPrecoVenda() {
		return textPrecoVenda;
	}

	public void setTextPrecoVenda(JTextField textPrecoVenda) {
		this.textPrecoVenda = textPrecoVenda;
	}

	public JComboBox<String> getComboBoxFornecedor() {
		return comboBoxFornecedor;
	}

	public void setComboBoxFornecedor(JComboBox<String> comboBoxFornecedor) {
		this.comboBoxFornecedor = comboBoxFornecedor;
	}

	public JButton getButtonNovo() {
		return buttonNovo;
	}

	public void setButtonNovo(JButton buttonNovo) {
		this.buttonNovo = buttonNovo;
	}

	public JButton getButtonSalvar() {
		return buttonSalvar;
	}

	public void setButtonSalvar(JButton buttonSalvar) {
		this.buttonSalvar = buttonSalvar;
	}

	public JButton getButtonEditar() {
		return buttonEditar;
	}

	public void setButtonEditar(JButton buttonEditar) {
		this.buttonEditar = buttonEditar;
	}

	public JButton getButtonCancelar() {
		return buttonCancelar;
	}

	public void setButtonCancelar(JButton buttonCancelar) {
		this.buttonCancelar = buttonCancelar;
	}

	public JTextArea getTextArea() {
		return textObservacao;
	}

	public void setTextArea(JTextArea textArea) {
		this.textObservacao = textArea;
	}

	//função limpa tela
	public void limpaTela()
	{
		textCodigo.setText("");
		textProduto.setText("");
		textPeso.setText("");
		textPrecoCompra.setText("");
		textPrecoVenda.setText("");
		comboBoxFornecedor.setSelectedIndex(0);
		textObservacao.setText("");
	}
	
}
