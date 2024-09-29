package lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so mang: ");
		int i;
		int x = sc.nextInt();

		int a[] = new int[x];

		for (i = 0; i < x; i++) {
			System.out.printf("Nhap mang i[%d]: ", i);
			a[i] = sc.nextInt();
		}

//		int max = a[0];
//		for (i = 0; i < a.length; i++) {
//			max = Math.max(max, a[i]);
//		}
//		System.out.println("Max = " + max);
//
//		int min = a[0];
//		for (i = 0; i < a.length; i++) {
//			min = Math.min(min, a[i]);
//		}
//
//		System.out.println("Min = " + min);
//       Dung khi chua dc sap xep
		Arrays.sort(a);
		System.out.println("Min = " + a[0]);
		System.out.println("Max = " + a[a.length - 1]);
		sc.close();
	}
}
