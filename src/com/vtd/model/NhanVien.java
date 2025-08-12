package com.vtd.model;

public class NhanVien {
	public String hoTen;
	public int tuoi;
	public String gioiTinh;
	public int luong;
	public float diemTrungBinh;
	
	public NhanVien(String hoTen, int tuoi, String gioiTinh, int luong, float diemTrungBinh) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.luong = luong;
		this.diemTrungBinh = diemTrungBinh;
	}
}
