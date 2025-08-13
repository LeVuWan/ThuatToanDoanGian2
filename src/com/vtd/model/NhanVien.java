package com.vtd.model;

public class NhanVien {
	private String hoTen;
	private int tuoi;
	private String gioiTinh;
	private int luong;
	private float diemTrungBinh;
	
	public NhanVien(String hoTen, int tuoi, String gioiTinh, int luong, float diemTrungBinh) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.luong = luong;
		this.diemTrungBinh = diemTrungBinh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}

	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

}
