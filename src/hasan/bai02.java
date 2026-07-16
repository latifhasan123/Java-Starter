package hasan;

import java.util.Scanner;

public class bai02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Chiều dài: ");
		int dai = sc.nextInt();
		System.out.println("Chiều rộng: ");
		int rong = sc.nextInt();
		System.out.println("Hình chữ nhật có: ");
		System.out.println("Chu vi " + (dai + rong) * 2);
		System.out.println("Diện tích: " + (dai * rong));
		System.out.println("Cạnh nhỏ nhât là: " + Math.min(dai, rong));
		sc.close();
	}
}
