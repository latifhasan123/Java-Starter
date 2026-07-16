package lab02;

import java.util.Scanner;

public class bai02 {
	public static void giaiphuongtrinhbacnhat(int a, int b) {
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			double x = (double) -b / a;
			System.out.println("Phương trình có nghiệm x = " + x);
		}
	}

	public static void main(String[] argv) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a:");
		int a = sc.nextInt();
		System.out.print("Nhap b:");
		int b = sc.nextInt();
		System.out.print("Nhap c:");
		int c = sc.nextInt();
		System.out.printf("Giải phương trình bậc hai %dx^2+%dx+%d=0\n", a, b, c);
		if (a == 0) {
			giaiphuongtrinhbacnhat(b, c);
		} else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				double x = (double) -b / (2 * a);
				System.out.println("Phương trình có nghiệm kép x=" + x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có 2 nghiệm riêng biệt:\nx1=" + x1 + "\nx2=" + x2);
			}
		}
		sc.close();
	}
}
