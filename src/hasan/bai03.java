package hasan;

import java.util.Scanner;

public class bai03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("cạnh ");
		int canh = sc.nextInt();
		double thetich = Math.pow(canh, 3);
		System.out.println("Thể tích của khối lập phương là: " + thetich);
		sc.close();

	}
}
