package src.main;
import src.main.Livro; 
import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros = new ArrayList<Livro>();

    
    public void registrarLivro(Livro livro){
        livros.add(livro);
    }

    public String retornaAutorArrayList(){
        
        return this.livros.get(0).getAutor();
    }

    public void emprestarLivro(int livroId, int membroId) {
        Livro livro = encontrarLivroPorId(livroId);

        if (livro != null) {
            if (!livro.getEmprestado()) {
                livro.emprestarLivro();
            }
        }
    }

    public void retornarLivro(int livroId, int membroId) {
        Livro livro = encontrarLivroPorId(livroId);

        if (livro != null) {
            if (livro.getEmprestado()) {
                livro.retornarLivro();
            }
        }
    }


   private Livro encontrarLivroPorId(int livroId) {
        for (Livro livro : livros) {
            if (livro.getId() == livroId) {
                return livro;
            }
        }
        return null;
    }

}
