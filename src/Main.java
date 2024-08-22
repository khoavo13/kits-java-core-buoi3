import trung_tam_the_hinh.DanhSachKhachHang;
import trung_tam_the_hinh.KhachHang;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DanhSachKhachHang ds = new DanhSachKhachHang();
        ds.enter();
        ds.print();

        List<KhachHang> richClient = ds.findMaxSpendMoneyClient();

        for (KhachHang k : richClient){
            System.out.println("Ten khach hang "+k.getName());
        }
    }
}