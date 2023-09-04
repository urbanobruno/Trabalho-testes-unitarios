package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

import src.main.Livro;

public class SistemaTest {
    
    // Test Livros

    // testCriarLivro(): Verifique se um livro pode ser criado corretamente.
    // testEmprestarLivro(): Verifique se o status de um livro pode ser alterado para emprestado.
    // testRetornarLivro(): Verifique se o status de um livro pode ser alterado para não emprestado.

    // Livro: Tem atributos como id, titulo, autor e emprestado.

    @Test
    public void testCriarLivro() {
        Livro livro = new Livro("Livro do Bruno", "Bruno", false);

        assertEquals("Livro do Bruno", livro.getTitulo());
        assertEquals("Bruno", livro.getAutor());
        assertFalse("O livro não deve estar emprestado (emprestado = false)", livro.getEmprestado());

    }

    @Test
    public void testEmprestarLivro() {
        Livro livro = new Livro("Livro do Bruno", "Bruno", false);

        livro.EmprestarLivro(); // faz a checagem para ver se o item não esta emprestado

        assertTrue(livro.getEmprestado());

    }

    @Test
    public void testRetornarLivro() {
        Livro livro = new Livro("Livro do Bruno", "Bruno", true);

        livro.RetornarLivro(); // faz a checagem para ver se o item esta emprestado

        assertFalse("livro deve ter sido retornado (emprestado = false)", livro.getEmprestado());

    }

}

