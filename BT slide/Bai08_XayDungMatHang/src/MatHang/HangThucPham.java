package MatHang;

class HangThucPham extends Hang {
    private String ngaySanXuat;
    private String ngayHetHan;

    public HangThucPham(String maHang, String tenHang, String nhaSanXuat, double gia, String ngaySanXuat, String ngayHetHan) {
        super(maHang, tenHang, nhaSanXuat, gia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public void XTT() {
        System.out.println("Hàng thực phẩm:");
        System.out.println("Mã hàng: " + maHang);
        System.out.println("Tên hàng: " + tenHang);
        System.out.println("Nhà sản xuất: " + nsx);
        System.out.println("Giá: " + gia);
        System.out.println("Ngày sản xuất: " + ngaySanXuat);
        System.out.println("Ngày hết hạn: " + ngayHetHan);
    }
}
