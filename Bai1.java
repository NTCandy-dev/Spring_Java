package lab03;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Nhap 1 so: ");
		int n = sc.nextInt();
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("Boi so khac: " + i);
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.printf("\n%d la so nguyen !", n);
		}
		sc.close();

	}
}
