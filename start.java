package lab09;

import java.util.Scanner;

public class start {
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
//		while (true)
//			try {
//				System.out.print("Nhap x: ");
//				x = sc.nextInt();
//				System.out.print("x = " + 10 / x);
//				break;
//			} catch (Exception e) {
//				sc.nextLine();
//				System.out.println("erro: ");
//
//			}
		System.out.println("Nhap tuoi: ");
		x = sc.nextInt();
		if (x < 18) {
			throw new ArithmeticException("Not enought");
		} else {
			System.out.println("You in ");
		}
	}
}
