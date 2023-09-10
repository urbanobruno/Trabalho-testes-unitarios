package src.main;

import java.util.ArrayList;

public class Membro {
	private int id;
	private String nome;
	private ArrayList<Livro> livrosEmprestados;
	
	public Membro(String nome) {
		this.id = VariaveisGlobais.idMembro;
		VariaveisGlobais.idMembro++;
		this.nome = nome;
		this.livrosEmprestados = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Livro> getLivrosEmprestados() {
		return livrosEmprestados;
	}

	public ArrayList<Livro> pegaLivroEmprestado(Livro livroEmprestado) {
		livrosEmprestados.add(livroEmprestado);
		return this.livrosEmprestados;
	}
	
	public ArrayList<Livro> devolveLivroEmprestado(int codigoLivro){
		livrosEmprestados.removeIf((livro) -> livro.getId() == codigoLivro);
		return livrosEmprestados;
	}
	
	
	
	
	

}
