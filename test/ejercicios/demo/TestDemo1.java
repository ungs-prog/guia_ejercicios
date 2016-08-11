package ejercicios.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDemo1
{
	@Test
	public void testOrdenado() {
		int arreglo[] = { 1, 2, 7, 19, 20 };
		assertTrue(Demo1.estaOrdenado(arreglo));
	}

	@Test
	public void testNoOrdenado() {
		int arreglo[] = { 1, 2, 19, 7, 30 };
		assertFalse(Demo1.estaOrdenado(arreglo));
	}

	@Test
	public void testNumerosNegativos() {
		int arreglo[] = { -10, -5, 0, 17, 21 };
		assertTrue(Demo1.estaOrdenado(arreglo));
	}

	@Test
	public void testDosElem() {
		int arreglo[] = { 2, 1 };
		assertFalse(Demo1.estaOrdenado(arreglo));
	}

	@Test
	public void testVacio() {
		int arreglo[] = {};
		assertTrue(Demo1.estaOrdenado(arreglo));
	}

}
