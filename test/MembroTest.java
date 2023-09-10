package test;

import static org.junit.Assert.*;
import org.junit.Test;
import src.main.Membro;

public class MembroTest {

	@Test
	public void testCriarMembro() {
		Membro membroTest = new Membro("Henrique");
		
		assertEquals(1, membroTest.getId());
		
		assertEquals("Henrique", membroTest.getNome());
		
		assertTrue(membroTest.getLivrosEmprestados().isEmpty());
		
		
	}
}
