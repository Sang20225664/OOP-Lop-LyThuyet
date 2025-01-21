package MatHang;

public class HangSanhSu extends Hang {
	
	private String loaiNL;
	public HangSanhSu(String ma, String ten, String nsx, double gia, String loaiNL) {
		super(ma, ten, nsx, gia);
		// TODO Auto-generated constructor stub
		this.loaiNL = loaiNL;
	}

	@Override
	public void XTT() {
		// TODO Auto-generated method stub
		System.out.println("Hàng sành sứ:");
        System.out.println("Mã hàng: " + maHang);
        System.out.println("Tên hàng: " + tenHang);
        System.out.println("Nhà sản xuất: " + nsx);
        System.out.println("Giá: " + gia);
        System.out.println("Loại nguyên liệu: " + loaiNL);
	}
	
}
