package lap03;

import java.util.Scanner;

public class bai01 {
	public static boolean checknt(int n) {
		if (n < 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên:");
		int n = sc.nextInt();
		if (checknt(n)) {
			System.out.println(n + "là số nguyên tố");
		} else
			System.out.println("Không phải là số nguyên tố");
		sc.close();
	}
}
