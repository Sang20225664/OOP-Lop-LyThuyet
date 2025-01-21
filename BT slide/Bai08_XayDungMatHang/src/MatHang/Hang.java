package MatHang;

abstract class Hang {
	protected String maHang;
	protected String tenHang;
	protected String nsx;
	protected double gia;
	
	public Hang(String ma, String ten, String nsx, double gia) {
		this.maHang = ma;
		this.tenHang = ten;
		this.nsx = nsx;
		this.gia = gia;
	}
	public abstract void XTT();
}
