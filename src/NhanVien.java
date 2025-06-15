abstract class NhanVien {
    protected String hoTen;
    protected String ngaySinh;

    public NhanVien(String hoTen, String ngaySinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public abstract double tinhLuong();
    public abstract void xuat();
}
