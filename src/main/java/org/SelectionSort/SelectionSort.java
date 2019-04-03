package org.SelectionSort;

/**
 * 
 * @author Daniele Damiano
 *
 * @param <T>
 *            Un classe di qualsiasi tipo che ha limite a tutti i tipi
 *            confrontabili perche estende Compatable<T> Opera in questo modo:
 *            Seleziona il minimo e la posizione dell'indice minimo, e lo
 *            confronta con un altro indice che parte da una posizione in avanti
 *            Se risulta essere minore si effettua una scambio di posizioni.
 * 
 *            Complessità O(n^2)
 * 
 */
public class SelectionSort<T extends Comparable<T>> {

	private int indiceMinimo;
	private T minimo;

	public SelectionSort() {
		this.indiceMinimo = 0;
		minimo = null;

	}

	/**
	 * 
	 * @param a
	 *            Un array di un qualsiasi tipo da ordinare
	 * 
	 */
	public void serach(T[] a) {

		for (int i = 0; i < a.length - 1; i = i + 1) {
			minimo = a[i];
			indiceMinimo = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].compareTo(minimo) < 0) {
					minimo = a[j];
					indiceMinimo = j;
				}
			}
			a[indiceMinimo] = a[i];
			a[i] = minimo;

		}

	}
	/**
	 * Stampa un array generico dando anche informazioni sul tipo
	 * 
	 * @param t Un array di qualsiasi tipo
	 */
	public void print(T[] t) {
		System.out.println("Tipo = " + " " + t.getClass().getTypeName());
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
	}

	public int getIndiceMinimo() {
		return indiceMinimo;
	}

	public void setIndiceMinimo(int indiceMinimo) {
		this.indiceMinimo = indiceMinimo;
	}

}
