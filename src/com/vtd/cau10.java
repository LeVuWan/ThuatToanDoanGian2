package com.vtd;

import java.util.Scanner;

public class cau10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = scanner.nextInt();

		tinhGiaoThua(n);
	}

	private static int tinhGiaoThua(int n) {
		int result = 0;
		for (int i = 2; i <= n; i += 2) {
			int k = 1;
			for (int j = 1; j <= i; j++) {
				k = k * j;
			}

			result += 1 / k;
		}

		return result;
	}
}
