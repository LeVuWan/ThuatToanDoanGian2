package com.vtd;

public class bai3 {
	public static void main(String[] args) {
		int result1 = congPhanNguyen(6.4, 8.6, 2.4);
		int result2 = congPhanNguyen(6.4, 8.6);
	}

	private static int congPhanNguyen(double d, double e) {
		return (int) (d + e);
	}

	private static int congPhanNguyen(double d, double e, double f) {
		return (int) (d + e + f);
	}
}
