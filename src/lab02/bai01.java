package lab02;

import java.util.Scanner;

public class bai01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a:");
		int a = sc.nextInt();
		System.out.print("Nhap b:");
		int b = sc.nextInt();
		System.out.printf("Giải phương trình %dx+%d=0\n", a, b);
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			double x = (double) -b / a;
			System.out.println("Phương trình có nghiệm x = " + x);
		}
		sc.close();
	}
}
