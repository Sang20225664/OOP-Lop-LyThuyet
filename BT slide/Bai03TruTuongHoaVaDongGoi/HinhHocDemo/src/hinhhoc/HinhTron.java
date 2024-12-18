package hinhhoc;

public class HinhTron{
	private double r;
	public HinhTron(double r) {
		this.r = r;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double tinhDienTich() {
		return Math.PI*r*r;
	}
	public double tinhChuVi() {
		return 2*Math.PI*r;
	}
	
}

