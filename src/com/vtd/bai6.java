package com.vtd;

import java.util.Scanner;

public class bai6 {
	static String name1 = "";
	static int age1 = 0;
	static String gender1 = "";
	static double salary1 = 0;
	static double averageScore1 = 0;

	static String name2 = "";
	static int age2 = 0;
	static String gender2 = "";
	static double salary2 = 0;
	static double averageScore2 = 0;

	static String name3 = "";
	static int age3 = 0;
	static String gender3 = "";
	static double salary3 = 0;
	static double averageScore3 = 0;

	static String name4 = "";
	static int age4 = 0;
	static String gender4 = "";
	static double salary4 = 0;
	static double averageScore4 = 0;

	static String name5 = "";
	static int age5 = 0;
	static String gender5 = "";
	static double salary5 = 0;
	static double averageScore5 = 0;

	static Scanner scn = new Scanner(System.in);
	static int n = 0;

	public static void main(String[] args) {
		nhap();
		xuat();
	}

	private static void xuat() {
		for (int i = 1; i <= n; i++) {
			System.out.println("Thong tin nhan vien thu " + i);

			switch (i) {
			case 1:
				System.out.println("Ten nhan vien: " + name1);
				System.out.println("Tuoi nhan vien: " + age1);
				System.out.println("Gioi tinh nhan vien: " + gender1);
				System.out.println("Luong nhan vien: " + salary1);
				System.out.println("Diem trung binh nhan vien: " + averageScore1);
				break;
			case 2:
				System.out.println("Ten nhan vien: " + name2);
				System.out.println("Tuoi nhan vien: " + age2);
				System.out.println("Gioi tinh nhan vien: " + gender2);
				System.out.println("Luong nhan vien: " + salary2);
				System.out.println("Diem trung binh nhan vien: " + averageScore2);
				break;
			case 3:
				System.out.println("Ten nhan vien: " + name3);
				System.out.println("Tuoi nhan vien: " + age3);
				System.out.println("Gioi tinh nhan vien: " + gender3);
				System.out.println("Luong nhan vien: " + salary3);
				System.out.println("Diem trung binh nhan vien: " + averageScore3);
				break;
			case 4:
				System.out.println("Ten nhan vien: " + name4);
				System.out.println("Tuoi nhan vien: " + age4);
				System.out.println("Gioi tinh nhan vien: " + gender4);
				System.out.println("Luong nhan vien: " + salary4);
				System.out.println("Diem trung binh nhan vien: " + averageScore4);
				break;
			case 5:
				System.out.println("Ten nhan vien: " + name5);
				System.out.println("Tuoi nhan vien: " + age5);
				System.out.println("Gioi tinh nhan vien: " + gender5);
				System.out.println("Luong nhan vien: " + salary5);
				System.out.println("Diem trung binh nhan vien: " + averageScore5);
				break;
			}
		}

	}

	private static void nhap() {
		System.out.println("n = ");
		n = scn.nextInt();
		scn = new Scanner(System.in);

		if (n > 5) {
			System.out.println("n khong lon hon 5");
			return;
		}

		for (int i = 1; i <= n; i++) {
			System.out.println("Moi nhap thong tin cho nhan vien thu " + i);

			switch (i) {
			case 1:
				System.out.println("name: ");
				name1 = scn.nextLine();

				System.out.println("gender: ");
				gender1 = scn.nextLine();

				System.out.println("age: ");
				age1 = scn.nextInt();
				scn = new Scanner(System.in);

				System.out.println("salary: ");
				salary1 = scn.nextDouble();
				scn = new Scanner(System.in);

				System.out.println("averageScore: ");
				averageScore1 = scn.nextDouble();
				scn = new Scanner(System.in);

				break;
			case 2:
				System.out.println("name: ");
				name2 = scn.nextLine();

				System.out.println("gender: ");
				gender2 = scn.nextLine();

				System.out.println("age: ");
				age2 = scn.nextInt();
				scn = new Scanner(System.in);

				System.out.println("salary: ");
				salary2 = scn.nextDouble();
				scn = new Scanner(System.in);

				System.out.println("averageScore: ");
				averageScore2 = scn.nextDouble();
				scn = new Scanner(System.in);

				break;
			case 3:
				System.out.println("name: ");
				name3 = scn.nextLine();

				System.out.println("gender: ");
				gender3 = scn.nextLine();

				System.out.println("age: ");
				age3 = scn.nextInt();
				scn = new Scanner(System.in);

				System.out.println("salary: ");
				salary3 = scn.nextDouble();
				scn = new Scanner(System.in);

				System.out.println("averageScore: ");
				averageScore3 = scn.nextDouble();
				scn = new Scanner(System.in);

				break;
			case 4:
				System.out.println("name: ");
				name4 = scn.nextLine();

				System.out.println("gender: ");
				gender4 = scn.nextLine();

				System.out.println("age: ");
				age4 = scn.nextInt();
				scn = new Scanner(System.in);

				System.out.println("salary: ");
				salary4 = scn.nextDouble();
				scn = new Scanner(System.in);

				System.out.println("averageScore: ");
				averageScore4 = scn.nextDouble();
				scn = new Scanner(System.in);

				break;
			case 5:
				System.out.println("name: ");
				name5 = scn.nextLine();

				System.out.println("gender: ");
				gender5 = scn.nextLine();

				System.out.println("age: ");
				age5 = scn.nextInt();
				scn = new Scanner(System.in);

				System.out.println("salary: ");
				salary5 = scn.nextDouble();
				scn = new Scanner(System.in);

				System.out.println("averageScore: ");
				averageScore5 = scn.nextDouble();
				scn = new Scanner(System.in);

				break;
			}
		}

	}
}
