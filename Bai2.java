package lab03;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap 1 so: ");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d\n", n, i, n * i);
		}
		sc.close();
	}
}
