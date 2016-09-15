package ejercicios.invertir;

/**
 * Implementación de una cola ENLAZADA.
 */
public class ColaGenerica<T>
{
	private NodoInt prim;
	private NodoInt ultim;

	public void encolar(T elem) {
		NodoInt nodo = null; // new NodoInt(elem);

		if (vacia())
			prim = nodo;
		else
			ultim.sig = nodo;

		ultim = nodo;
	}

	public boolean vacia() {
		return prim == null;
	}

	public T primero() {
		if (vacia())
			return null;

		// return prim.val;
		return null;
	}

	public T desencolar() {
		T v = primero();

		if (!vacia()) {
			prim = prim.sig;

			if (prim == null)
				ultim = null;
		}

		return v;
	}
}
