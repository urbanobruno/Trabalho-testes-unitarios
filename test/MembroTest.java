package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import src.main.Livro;
import src.main.Membro;

public class MembroTest {

	@Test
	public void testCriarMembro() {
		Membro membroTest = new Membro("Henrique");
		
		assertEquals(1, membroTest.getId());
		
		assertEquals("Henrique", membroTest.getNome());
		
		assertTrue(membroTest.getLivrosEmprestados().isEmpty());
		
		
	}

	@Test
	public void testPegaLivroEmprestado(){
		Membro membroTest = new Membro("Alberto");
		Livro livroTest = new Livro("Livro do Alberto", "Alberto", false);
		List<Livro> livrosEmprestadosMembro = membroTest.pegaLivroEmprestado(livroTest);
		
		assertEquals(1, livrosEmprestadosMembro.size());
        assertEquals(livroTest, livrosEmprestadosMembro.get(0));
	}

	@Test
    public void testDevolveLivroEmprestado() {
		Membro membroTest = new Membro("Alberto");
		Livro livroTest = new Livro("Livro do Alberto", "Alberto", false);
        membroTest.pegaLivroEmprestado(livroTest);

        ArrayList<Livro> livrosEmprestadosMembro = membroTest.devolveLivroEmprestado(livroTest.getId());

        assertEquals(0, livrosEmprestadosMembro.size());
    }
}
