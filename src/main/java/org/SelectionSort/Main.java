package org.SelectionSort;

public class Main {

	public static void main(String[] args) {

		SelectionSort<Integer> f = new SelectionSort<Integer>();
		/* Confronta interi */
		Integer a[] = { 23, 34, 54, 22, 1, 3 };
		f.serach(a);
		f.print(a);

		/* Confronta double */
		SelectionSort<Double> selectionSort = new SelectionSort<Double>();
		Double d[] = { 23.2, 34.3, 54.5, 22.0, 1.0, 3.0 };
		selectionSort.serach(d);
		selectionSort.print(d);
		
		/* Confronta Long */
		SelectionSort<Long> selectionSort2 = new SelectionSort<Long>();
		Long l[] = { 122121l, 323233l, 11111l, 223345445l, 234356332l, 3333333l };
		selectionSort2.serach(l);
		selectionSort2.print(l);
		
		
		/* Confronta String */
		SelectionSort<String> selectionSort3 = new SelectionSort<String>();
		String s[] = { "Daniele", "Salvatore", "Antonio", "Carmela", "Pippo", "E Baudo"};
		selectionSort3.serach(s);
		selectionSort3.print(s);
	}

}
