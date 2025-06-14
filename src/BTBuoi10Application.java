public class BTBuoi10Application {
    public static void main(String[] args) {
        printDivider(1);
        PhanSo ps = new PhanSo();
        ps.nhap();
        ps.xuat();

        printDivider(2);

    }

    public static void printDivider(int soBai){
        System.out.println("------------------- BÀI TẬP " + soBai + " ------------------------");
    }
}
