package pack;

public class CanBoQuanLy extends NhanVien implements QuanLy {
    private double loiNhuanCongTy;

    // Constructor
    public CanBoQuanLy(String tenNhanVien, double luongCoBan, double heSoLuong, double loiNhuanCongTy) {
        super(tenNhanVien, luongCoBan, heSoLuong);
        this.loiNhuanCongTy = loiNhuanCongTy;
    }

    // Tính hoa hồng (0.2% lợi nhuận công ty)
    @Override
    public double tinhHoaHong() {
        return 0.002 * loiNhuanCongTy;
    }

    // Tính lương tổng cộng
    @Override
    public double tinhLuong() {
        return super.tinhLuong() + tinhHoaHong();
    }

    // In thông tin cán bộ quản lý
    @Override
    public void inTTin() {
        super.inTTin();
        System.out.printf("Hoa hồng: %.2f, Tổng lương: %.2f\n",
                tinhHoaHong(), tinhLuong());
    }
}
