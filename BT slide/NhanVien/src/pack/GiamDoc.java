package pack;

public class GiamDoc extends NhanVien implements QuanLy {
    private double phuCap;
    private double loiNhuanCongTy;

    // Constructor
    public GiamDoc(String tenNhanVien, double luongCoBan, double heSoLuong, double phuCap, double loiNhuanCongTy) {
        super(tenNhanVien, luongCoBan, heSoLuong);
        this.phuCap = phuCap;
        this.loiNhuanCongTy = loiNhuanCongTy;
    }

    // Tính hoa hồng (5% lợi nhuận công ty)
    @Override
    public double tinhHoaHong() {
        return 0.05 * loiNhuanCongTy;
    }

    // Tính lương tổng cộng
    @Override
    public double tinhLuong() {
        return super.tinhLuong() + phuCap + tinhHoaHong();
    }

    // In thông tin giám đốc
    @Override
    public void inTTin() {
        super.inTTin();
        System.out.printf("Phụ cấp: %.2f, Hoa hồng: %.2f, Tổng lương: %.2f\n",
                phuCap, tinhHoaHong(), tinhLuong());
    }
}
