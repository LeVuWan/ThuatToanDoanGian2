package com.vtd;

import java.util.Scanner;

public class bai9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gia sua: 8 vnd");
		System.out.println("Gia vo chai: 3 vnd");
		System.out.print("Nhap so tien hien co: ");
		int c = scanner.nextInt();

		milk(c);
	}

	private static void milk(int c) {
		int a = 8;
		int b = 3;

		int bottles = 0;

		while (c >= a) {
			c -= a;
			bottles++;
			c += b;
		}

		System.out.println("Số chai uống được: " + bottles);
		System.out.println("Tiền còn lại: " + c);
	}
}
