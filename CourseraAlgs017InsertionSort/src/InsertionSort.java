
public class InsertionSort {

	public static void sort(Comparable[] a) {

		int N = a.length;

		for (int i = 0; i < N; i++) {
			for (int j = i; j >= 1; j--) {
				if (less(a[j], a[j-1]))
					{swap(a, j, j-1);}
				else break;
			}
		}

	}

	private static boolean less(Comparable x, Comparable y) {

		return x.compareTo(y) < 0;

	}

	private static void swap(Comparable[] a, int i, int j) {

		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;

	}

}
