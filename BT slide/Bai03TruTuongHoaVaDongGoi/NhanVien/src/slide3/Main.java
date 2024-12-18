package slide3;

public class Main {
	public static void main(String [] args) {
		NhanVien T1 = new NhanVien();
        NhanVien T2 = new NhanVien();
        NhanVien T3 = new NhanVien();
        T1.setTenNhanVien("Quoc Tuan");
        T2.setTenNhanVien("Trong Tuan");
        T3.setTenNhanVien("   ");
        T3.setTenNhanVien("Hoang Duc");
        T1.setLuongCoBan(2000000);
        T2.setLuongCoBan(2000000);
        T3.setLuongCoBan(2000000);
        T1.setHeSoLuong(6.5);
        T2.setHeSoLuong(5.1);
        T3.setHeSoLuong(5.1);        
        T1.tangLuong(16.5);
        T2.tangLuong(7.5);
        T1.inInformation();
        T2.inInformation();
        T3.inInformation();
	}
}
