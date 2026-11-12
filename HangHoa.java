package phanLeTuanMinh_25660071;

import java.time.LocalDate;

public class HangHoa {
	private String maHang;
	private String tenHang;
	private String hangSX;
	private double giaBan;
	private float soLuongTon;
	private LocalDate ngayNhapHang;
	
	public HangHoa(String maHang, String tenHang, String hangSX, double giaBan, float soLuongTon,
			LocalDate ngayNhapHang) {
		setMaHang(maHang);
		setTenHang(tenHang);
		setHangSX(hangSX);
		setGiaBan(giaBan);
		setSoLuongTon(soLuongTon);
		setNgayNhapHang(ngayNhapHang);
	}

	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		if(maHang.trim().isEmpty()) {
			throw new IllegalArgumentException("Ma hang khong duoc rong");
		}
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		if(tenHang.trim().isEmpty()) {
			throw new IllegalArgumentException("Ten hang khong duoc rong");
		}
		this.tenHang = tenHang;
	}

	public String getHangSX() {
		return hangSX;
	}

	public void setHangSX(String hangSX) {
		if(hangSX.trim().isEmpty()) {
			throw new IllegalArgumentException("Hang san xuat khong duoc rong");
		}
		this.hangSX = hangSX;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		if(giaBan <= 0) {
			throw new IllegalArgumentException("Gia ban phai lon hon khong");
		}
		this.giaBan = giaBan;
	}

	public float getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(float soLuongTon) {
		if(soLuongTon < 0) {
			throw new IllegalArgumentException("So luong ton phai lon hon hoac bang khong");
		}
		this.soLuongTon = soLuongTon;
	}

	public LocalDate getNgayNhapHang() {
		return ngayNhapHang;
	}

	public void setNgayNhapHang(LocalDate ngayNhapHang) {
		if(ngayNhapHang <= LocalDate.now()) {
			throw new IllegalArgumentException("Ngay nhap hang phai truoc hoac bang ngay hien tai");
		}
		this.ngayNhapHang = ngayNhapHang;
	}
	
	public double tinhTongGiaTri() {
		double tongGiaTri = this.giaBan * this.soLuongTon;
		return tongGiaTri;
	}
	
	@Override
	public String toString() {
		return String.format("Ma hang: %s | Ten hang: %s | Hang SX: %s | Gia ban: %.2f (VND) | So luong to : %f | Ngay nhap hang: ",maHang,tenHang,hangSX,giaBan,soLuongTon,ngayNhapHang);
	}
	
}
