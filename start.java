package lab03;

import java.util.Arrays;

public class start {
	public static void main(String[] args) {
		int a[] = { 12, 27, 9, 76, 2 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("Sau khi duoc sap xep: " + Arrays.toString(a));
	}
}
