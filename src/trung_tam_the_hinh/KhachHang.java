package trung_tam_the_hinh;

import java.util.Scanner;

public class KhachHang {
    private String hoTen;
    private String cccd;
    private int soThang;
    private ServicePackage dichVu;

    public KhachHang() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public int getSoThang() {
        return soThang;
    }

    public void setSoThang(int soThang) {
        this.soThang = soThang;
    }

    public void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten khach hang: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhap so CCCD: ");
        this.cccd = sc.nextLine();
        System.out.print("Nhap so thang muon su dung dich vu: ");
        this.soThang = sc.nextInt();

        System.out.println("1: Sử dụng dịch vụ Premium");
        System.out.println("2: Sử dụng dịch vụ Basic");
        System.out.println("3: Sử dụng dịch vụ Non Member");
        System.out.print("Dịch vụ lựa chọn: ");
        int option = sc.nextInt();
        if (option == 1){
            this.dichVu = new PremiumService();
        }
        else if (option == 2){
            System.out.println("Nhap so lop");
            int soLop = sc.nextInt();
            this.dichVu = new BasicService(soLop);
        }
        else if (option == 3){
            this.dichVu = new NonMemberService();
        }
        System.out.println("Chuc mung ban da dang ki thanh cong");
    }
    public void print(){
        System.out.print("Ten khach hang: " + this.hoTen + " -- so CCCD" + this.cccd + " -- thoi gian su dung dich vu: " + this.soThang);
    }
    public Long tongGia(){
        return dichVu.tinhTien() * this.soThang;
    }
}
