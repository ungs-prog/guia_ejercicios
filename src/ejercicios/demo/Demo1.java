package ejercicios.demo;

public class Demo1
{
	/**
	 * Devuelve verdadero si el arreglo está ordenado.
	 */
	public static boolean estaOrdenado(int[] arreglo) {
		boolean ret = true;

		for (int i = 0; i < arreglo.length - 1; i++) {
			ret = ret && (arreglo[i] < arreglo[i + 1]);
		}

		return ret;
	}
}
