package com.vtd;

import java.util.Scanner;

public class bai6_7_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int count = 0;

		while (count < 5) {
			System.out.println("Nhập thông tin nhân viên thứ " + (count + 1) + ":");

			System.out.print("Tên: ");
			String ten = sc.nextLine();

			System.out.print("Tuổi: ");
			int tuoi = Integer.parseInt(sc.nextLine());

			System.out.print("Giới tính: ");
			String gioiTinh = sc.nextLine();

			System.out.print("Điểm trung bình: ");
			double diemTB = Double.parseDouble(sc.nextLine());

			System.out.print("Lương: ");
			double luong = Double.parseDouble(sc.nextLine());

			sb.append("Nhân viên ").append(count + 1).append(":\n").append("  Tên: ").append(ten).append("\n")
					.append("  Tuổi: ").append(tuoi).append("\n").append("  Giới tính: ").append(gioiTinh).append("\n")
					.append("  Điểm TB: ").append(diemTB).append("\n").append("  Lương: ").append(luong).append("\n\n");

			count++;

			if (count < 5) {
				System.out.print("Bạn có muốn nhập tiếp không? (Yes/No): ");
				String tiepTuc = sc.nextLine().trim();
				if (tiepTuc.equalsIgnoreCase("No")) {
					break;
				}
			}
		}

		System.out.println("\n===== DANH SÁCH NHÂN VIÊN =====");
		System.out.println(sb.toString());

		sc.close();
	}
}
