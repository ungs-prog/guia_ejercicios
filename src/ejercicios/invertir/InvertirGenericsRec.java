package ejercicios.invertir;

// Convertir a Generics el código RECURSIVO visto en clase.
//
// Código recursivo original:
//
// https://github.com/ungs-prog2/codigo_aula/blob/2016_2/src/clase12/InvertirRecursivo.java

public class InvertirGenericsRec
{
	public static <T> void invertirCola(ColaGenerica<T> cola) {
	}

	public static <T> ColaGenerica<T> pilaInversa(PilaGenerica<T> pila) {
		return null;
	}

	private static <T> void pilaInversa_rec(PilaGenerica<T> pila, ColaGenerica<T> cola) {
	}

	//
	// OPCIONAL: versión de pilaInversa() que NO usa función auxiliar.
	//
	public static <T> ColaGenerica<T> pilaInversaRec(PilaGenerica<T> pila) {

		// ...

		// X ret = pilaInversaRec(/* ... */);

		return null;  // ret
	}
}
