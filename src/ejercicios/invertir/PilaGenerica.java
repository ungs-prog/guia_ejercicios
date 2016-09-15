package ejercicios.invertir;

public class PilaGenerica<T>
{
	private NodoInt tope;

	public void apilar(T elem) {
		// tope = new NodoInt(elem, tope);
	}

	public boolean vacia() {
		return tope == null;
	}

	public T tope() {
		if (tope == null)
			return null;

		// return tope.val;
		return null;
	}

	public T desapilar() {
		Integer v = null;

		if (tope != null) {
			v = tope.val;
			tope = tope.sig;
		}

		// return v;
		return null;
	}
}
