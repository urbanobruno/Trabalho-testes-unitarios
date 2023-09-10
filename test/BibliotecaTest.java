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

}
