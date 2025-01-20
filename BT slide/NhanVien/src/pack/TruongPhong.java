package pack;

public class TruongPhong extends NhanVien {
    private double phuCap; // Phụ cấp của trưởng phòng
    private int soNamDuongChuc; // Số năm đương chức

    // Constructor mặc định
    public TruongPhong() {
        super();
        this.phuCap = 0.0;
        this.soNamDuongChuc = 0;
    }

    // Constructor có tham số
    public TruongPhong(String tenNhanVien, double heSoLuong, double phuCap, int soNamDuongChuc) {
        super(tenNhanVien, heSoLuong);
        this.phuCap = phuCap > 0 ? phuCap : 0.0;
        this.soNamDuongChuc = soNamDuongChuc > 0 ? soNamDuongChuc : 0;
    }

    // Getter và Setter cho `phuCap`
    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        if (phuCap >= 0) {
            this.phuCap = phuCap;
        } else {
            System.out.println("Phụ cấp không hợp lệ!");
        }
    }

    // Getter và Setter cho `soNamDuongChuc`
    public int getSoNamDuongChuc() {
        return soNamDuongChuc;
    }

    public void setSoNamDuongChuc(int soNamDuongChuc) {
        if (soNamDuongChuc >= 0) {
            this.soNamDuongChuc = soNamDuongChuc;
        } else {
            System.out.println("Số năm đương chức không hợp lệ!");
        }
    }

    // Phương thức tính lương
    @Override
    public double tinhLuong() {
        return super.tinhLuong() + phuCap;
    }

    // Phương thức in thông tin
    @Override
    public void inTTin() {
        System.out.printf("Tên trưởng phòng: %s, Hệ số lương: %.2f, Phụ cấp: %.2f, Lương: %.2f, Số năm đương chức: %d%n",
                getTenNhanVien(), getHeSoLuong(), phuCap, tinhLuong(), soNamDuongChuc);
    }
}
