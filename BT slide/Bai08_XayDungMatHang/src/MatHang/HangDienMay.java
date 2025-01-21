package MatHang;

public class HangDienMay extends Hang{

	private int tgbh;
	private double dienAp;
	private double congSuat;
	public HangDienMay(String ma, String ten, String nsx, double gia, int tgbh, double dienAp, double congSuat) {
		super(ma, ten, nsx, gia);
		// TODO Auto-generated constructor stub
		this.tgbh = tgbh;
		this.dienAp = dienAp;
		this.congSuat = congSuat;
	}


	@Override
	public void XTT() {
		// TODO Auto-generated method stub
		System.out.println("Hàng điện máy:");
        System.out.println("Mã hàng: " + maHang);
        System.out.println("Tên hàng: " + tenHang);
        System.out.println("Nhà sản xuất: " + nsx);
        System.out.println("Giá: " + gia);
        System.out.println("Thời gian bảo hành: " + tgbh + " tháng");
        System.out.println("Điện áp: " + dienAp + "V");
        System.out.println("Công suất: " + congSuat + "W");
	}
	
	
}
