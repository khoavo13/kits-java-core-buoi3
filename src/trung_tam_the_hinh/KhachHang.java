package trung_tam_the_hinh;

import java.util.Scanner;

public class KhachHang {
    private String name;
    private String ID;
    private int timeOfUse;
    ServicePackage s;

    public KhachHang() {
    }

    public KhachHang(String name, String so_CMND, int thoiGian) {
        this.name = name;
        this.ID = so_CMND;
        this.timeOfUse = thoiGian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getTimeOfUse() {
        return timeOfUse;
    }

    public void setTimeOfUse(int timeOfUse) {
        this.timeOfUse = timeOfUse;
    }

    public void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten khach hang: ");
        this.name = sc.nextLine();
        System.out.print("Nhap so CMND: ");
        this.ID = sc.nextLine();
        System.out.print("Nhap thoi gian muon su dung dich vu: ");
        this.timeOfUse = sc.nextInt();

        System.out.println("1: Sử dụng dịch vụ Premium");
        System.out.println("2: Sử dụng dịch vụ Basic");
        System.out.println("3: Sử dụng dịch vụ Non Member");
        System.out.print("Dịch vụ lựa chọn: ");
        int option = sc.nextInt();
        if (option == 1){
            this.s = new PremiumService();
        }
        else if (option == 2){
            this.s = new BasicService();
        }
        else if (option == 3){
            this.s = new NonMemberService();
        }
        System.out.println("Chuc mung ban da dang ki thanh cong");
    }
    public void print(){
        System.out.print("Ten khach hang: " + this.name + " -- so CMND" + this.ID + " -- thoi gian su dung dich vu: " + this.timeOfUse);
        this.s.print();
    }
    public int priceTotal(){
        return s.price() * this.timeOfUse;
    }
}
