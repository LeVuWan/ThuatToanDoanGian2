package com.vtd;

import java.util.Scanner;

import com.vtd.model.NhanVien;

public class bai5 {
	public static void main(String[] args) {
		NhanVien nhanVien = nhapNhanVien();

		xuatNhanVien(nhanVien);
	}

	private static NhanVien nhapNhanVien() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhap ten: ");
		String hoTen = scanner.nextLine();

		System.out.print("Nhap tuoi: ");
		int tuoi = Integer.parseInt(scanner.nextLine());

		System.out.print("Nhap gioi tinh: ");
		String gioiTinh = scanner.nextLine();

		System.out.print("Nhap luong: ");
		int luong = Integer.parseInt(scanner.nextLine());

		System.out.print("Nhap diem trung binh: ");
		float diemTrungBinh = Float.parseFloat(scanner.nextLine());

		return new NhanVien(hoTen, tuoi, gioiTinh, luong, diemTrungBinh);
	}

	private static void xuatNhanVien(NhanVien nhanVien) {
		System.out.println("Ten nhan vien: " + nhanVien.getHoTen());
		System.out.println("Tuoi nhan vien: " + nhanVien.getTuoi());
		System.out.println("Gioi tinh nhan vien: " + nhanVien.getGioiTinh());
		System.out.println("Luong nhan vien: " + nhanVien.getLuong());
		System.out.println("Diem trung binh nhan vien: " + nhanVien.getDiemTrungBinh());
	}
}
