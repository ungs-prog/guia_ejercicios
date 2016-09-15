package ejercicios.invertir;

// Convertir a Generics el código visto en clase.
//
// Código original:
//
// https://github.com/ungs-prog2/codigo_aula/blob/2016_2/src/clase12/InvertirIterativo.java

public class InvertirGenerics
{
	/**
	 * Invierte una pila. No devuelve nada, la modifica.
	 *
	 * Usa una cola para “darle la vuelta”.
	 */
	public static <T> void invertirPila(PilaGenerica<T> pila) {
	}

	/**
	 * Invierte una cola. No devuelve nada, la modifica.
	 *
	 * Ver versión recursiva en InvertirRecursivo.java.
	 */
	public static <T> void invertirCola(ColaGenerica<T> cola) {
	}

	/**
	 * Devuelve una cola, resultado de invertir una pila. La pila queda
	 * en su estado original.
	 */
	public static <T> ColaGenerica<T> pilaInversa(PilaGenerica<T> pila) {
		return null;
	}
}
