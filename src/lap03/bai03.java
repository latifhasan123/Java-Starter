package lap03;

import java.util.Arrays;
import java.util.Scanner;

public class bai03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng phần tử của mảng: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.print("Nhập phần tử: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		int max, min;
		max = a[0];
		min = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] > max)
				max = a[i];
		}
		for (int i = 1; i < n; i++) {
			if (a[i] < min)
				min = a[i];
		}
		System.out.println("Phần tử lớn nhất là: " + max);
		System.out.println("Phần tử nhỏ nhất là: " + min);
		sc.close();
	}
}
