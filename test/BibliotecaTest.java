package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import src.main.Biblioteca;
import src.main.Livro;

public class BibliotecaTest {
    
    @Test
    public void testRegistrarLivro(){
        Livro livro = new Livro("Livro do Pedro", "Pedro", false);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.registrarLivro(livro);
        
        assertEquals("Pedro", biblioteca.retornaAutorArrayList());
    }

    @Test
    public void testEmprestarLivro() {
        Livro livro = new Livro("Livro do Pedro", "Pedro", false);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.registrarLivro(livro);
        
        assertFalse(livro.getEmprestado()); 

        biblioteca.emprestarLivro(livro.getId(), 1); 

        assertTrue(livro.getEmprestado());
    }


    @Test
    public void testRetornarLivro() {
        Livro livro = new Livro("Livro do Pedro", "Pedro", false);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.registrarLivro(livro);
        
        assertFalse(livro.getEmprestado()); 
        biblioteca.emprestarLivro(livro.getId(), 1);
        assertTrue(livro.getEmprestado()); 
        biblioteca.retornarLivro(livro.getId(), 1); 
        assertFalse(livro.getEmprestado()); 
    }
}


