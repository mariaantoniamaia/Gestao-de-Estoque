package dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Produto;

public class ProdutoDAO {

	private File arquivo;
	private FileWriter fw;
	private BufferedWriter bw;
	
	//construtor vazio
	public ProdutoDAO() {
		super();
		
		arquivo = new File("cadproduto.txt");
	}
	
	//função boolean de cadastro
	public boolean cadastraProduto(Produto p)
	{
		try {
			fw = new FileWriter(arquivo, true);
			bw = new BufferedWriter(fw);
			
			bw.write(p.toString());
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		finally {
			try {
				fw.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return true;
	}
	
}
