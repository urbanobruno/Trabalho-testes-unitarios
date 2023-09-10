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

    public void emprestarLivro(int livroId, int membroId){

    }

    public void retornarLivro(int livroId, int membroId){

    }
}
