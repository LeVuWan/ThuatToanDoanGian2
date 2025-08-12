package com.vtd;

public class bai2 {
	public static void main(String[] args) {
		int a = 12;
		int b = 18;
		int c = 20;
		int result = uocChungLonNhat(a, b, c);
		System.out.println(result);
	}

	private static int uocChungLonNhat(int a, int b, int c) {
		int result = 1;

		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;

		for (int i = 2; i <= min; i++) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				result = i;
			}
		}

		return result;
	}
}
