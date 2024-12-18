package slide3;

public class NhanVien{
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    final public double LUONG_MAX = 15000000.0;
    /* set-get tenNhanVien */
    public boolean setTenNhanVien(String tnv) {
        if(tnv.trim().equals("")){
            System.out.println("Khong the thiet lap duoc ten nhan vien la rong");
            return false;
        }
        else{
            tenNhanVien = tnv;
            return true;
        }
    }
 
    public String getTenNhanVien(){
        return tenNhanVien;
    }
    /* set-get luongCoBan */
    public boolean setLuongCoBan(double lcb) {
        if(lcb <= 0){
            System.out.println("Khong the thiet lap duoc luong co ban <= 0");
            return false;
        }
        if(lcb*heSoLuong <= LUONG_MAX){
            luongCoBan = lcb;
            return true;
        }
        else{
            System.out.println("Khong the thiet lap duoc luong co ban");
            return false;
        }
    }
    public double getLuongCoBan() {
        return luongCoBan;
    }       
    /* set-get heSoLuong */
    public boolean setHeSoLuong(double hsl) {
        if(hsl <= 0){
            System.out.println("Khong the thiet lap duoc he so luong < 0");
            return false;
        }
        if(luongCoBan*hsl <= LUONG_MAX){
            heSoLuong = hsl;
            return true;
        }
        else{
            System.out.println("Khong the thiet lap duoc he so luong");
            return false;
        }
    }
    public double getHeSoLuong() {
        return heSoLuong;
    }
    /* get LUONG_MAX */

    public double getLUONG_MAX() {
        return LUONG_MAX;
    }
    /* cac phuong thuc khac */
    public double tinhLuong(){
        return luongCoBan*heSoLuong;
    }
    public boolean tangLuong(double hsl_moi_them){
        if(hsl_moi_them<=0) {
            System.out.println("Khong the thiet lap duoc he so luong moi do < 0");
            return false;
        }
        if((heSoLuong+hsl_moi_them)*luongCoBan > LUONG_MAX){
            System.out.println("Khong tang luong cho nhan vien "+tenNhanVien+" vi vuot qua gioi han luong");
            return false;
        }
        else{
            heSoLuong += hsl_moi_them;
            return true;
        }
    }
    public void inInformation(){
        System.out.println("Nhan vien co ten:'"+this.tenNhanVien+"' co luong co ban "+this.luongCoBan+" co he so luong "+this.heSoLuong+" co luong la "+tinhLuong());
    }
}