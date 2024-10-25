package lab09;

import java.util.Scanner;

public class Main {
	public static int Nhapmasv() {
		Scanner sc = new Scanner(System.in);
		int masv;

		while (true) {
			try {
				System.out.print("Nhap masv: ");
				masv = sc.nextInt();
				break;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("Nhap masv khong hop le !");
			}
		}
		return masv;
	}

	public static int Nhaptuoisv() {
		Scanner sc = new Scanner(System.in);
		int age;
		while (true) {
			try {
				System.out.print("Nhap tuoi sv: ");
				age = sc.nextInt();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return age;
	}

	public static double Nhapdiem() {
		Scanner sc = new Scanner(System.in);
		double diem;
		while (true) {
			try {
				System.out.print("Nhap diem: ");
				diem = sc.nextDouble();
				break;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("Nhap diem khong hop le !");
				// TODO: handle exception
			}
		}
		return diem;
	}

	public static String Nhapten() {
		Scanner sc = new Scanner(System.in);
		String hoten;
		System.out.print("Nhap ten: ");
		return hoten = sc.nextLine();
	}

	public static void main(String[] args) {
		int masv = Nhapmasv();
		int age = Nhaptuoisv();
		double diem = Nhapdiem();
		String hoten = Nhapten();
		Sinhvien sv = new Sinhvien(masv, hoten, diem, age);
		System.out.println(sv);
	}
}
