package hasan;

import java.util.Scanner;

public class bai01 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Điểm: ");
		int diem = sc.nextInt();
		sc.nextLine();
		System.out.print("Họ tên học sinh: ");
		String ten = sc.nextLine();
		System.out.println("Họ tên: " + ten + "\nĐiểm: " + diem);
		sc.close();

	}
}
