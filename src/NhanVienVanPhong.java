class NhanVienVanPhong extends NhanVien {
    private int soNgayLam;

    public NhanVienVanPhong(String hoten, String ngaysinh, int soNgayLam) {
        super(hoten, ngaysinh);
        this.soNgayLam = soNgayLam;
    }

    @Override
    public double tinhLuong() {
        return soNgayLam * 100000;
    }

    @Override
    public void xuat() {
        System.out.printf("NV Văn Phòng: %s | Ngày sinh: %s | Lương: %.2f\n", hoTen, ngaySinh, tinhLuong());
    }
}