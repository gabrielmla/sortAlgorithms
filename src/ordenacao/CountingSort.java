package ordenacao;

public class CountingSort {

	public void sort(int[] a, int k) {
		int[] c = new int[k + 1];
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			c[a[i]]++;
		}

		for (int i = 1; i < c.length; i++) {
			c[i] += c[i - 1];
		}

		for (int i = b.length - 1; i >= 0; i--) {
			b[c[a[i]] - 1] = a[i];
			c[a[i]]--;
		}

		for (int i = 0; i < a.length; i++) {
			a[i] = b[i];
		}

	}
}
