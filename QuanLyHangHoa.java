package phanLeTuanMinh_25660071;

public class QuanLyHangHoa {
	private HangHoa[] ds;
	private int n;
	private int khaNang;
	
	public boolean themHangHoa(HangHoa hh) {
		if(n >= ds.length) {
			return false;
		}
		for(int i = 0; i<n;i++) {
			if(ds[i].getMaHang() == hh.getMaHang()) {
				return false;
			}
		}
		ds[n] = hh;
		n++;
		return true;
	}
	
	public String TimViTriTheoMa(String maHang) {
		for (int i=0 ; i<n; i++) {
			if(ds[i].getMaHang() == maHang ) return ds[i].getMaHang();
		}
		return null;
	}
	
	public boolean xoaHangHoa(String maHang) {
		int viTri = TimViTriTheoMa(maHang);
		if(viTri == -1) {
			System.out.println("Khong tim thay hang hoa ma"+maHang);
			return false;
		}
		for(int i = viTri; i<n-1;i++) 
			ds[i] = ds[i+1];
		ds[n-1] = null;
		n--;
		return true;
	}
	
	public boolean suaGiaBan(String maHang, double giaMoi) {
		int viTri = TimViTriTheoMa(maHang);
		if(viTri == -1) {
			System.out.println("Khong tim thay hang hoa ma" + maHang);
			return false;
		}
		HangHoa hh = ds[viTri];
		hh.setGiaBan(giaMoi);
		return true;
	}
	
	public void xuatTatCa(LocalDate ngay) {
		if(n== 0) {
			System.out.println("Danh sach hang hoa trong");
			return;
		}
		System.out.println("\n+----------+-----------+-----------+----------+-----------+-----------+\n");
		System.out.println("| MaHang      | TenHang   | HangSX    | GiaBan   | SoLuongTo | NgayNhapHang|");
		System.out.println("\n+----------+-----------+-----------+----------+-----------+-----------+\n");
		for(int i = 0; i<n ;i++) {
			System.out.println(ds[i]);
		}
	}
	
}
