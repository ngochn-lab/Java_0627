class NhanVienSanXuat extends NhanVien {
    private double luongCB;
    private int soSanPham;

    public NhanVienSanXuat(String hoten, String ngaysinh, double luongCB, int soSanPham) {
        super(hoten, ngaysinh);
        this.luongCB = luongCB;
        this.soSanPham = soSanPham;
    }

    @Override
    public double tinhLuong() {
        return luongCB + soSanPham * 5000;
    }

    @Override
    public void xuat() {
        System.out.printf("NV Sản Xuất: %s | Ngày sinh: %s | Lương: %.2f\n", hoTen, ngaySinh, tinhLuong());
    }
}
