package trung_tam_the_hinh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachKhachHang {
    private List<KhachHang> arr;

    public DanhSachKhachHang() {
        this.arr = new ArrayList<>();
    }

    public void enter() {
        while (true) {
            System.out.println("1: Them khach hang");
            System.out.println("2: Thoat");
            System.out.print("Lựa chọn: ");
            Scanner sc = new Scanner(System.in);
            int flag = sc.nextInt();
            if (flag == 1) {
                KhachHang kh = new KhachHang();
                kh.enter();
                arr.add(kh);
            } else {
                break;
            }
        }
    }

    public void print() {
        for (KhachHang k :arr){
            k.print();
        }
    }

    public List<KhachHang> findMaxSpendMoneyClient(){
        List<KhachHang> khList = new ArrayList<>();
        int tempPrice = 0;
        for (KhachHang k : this.arr){
            if (tempPrice < k.priceTotal()){
                tempPrice = k.priceTotal();
                khList.clear();
                khList.add(k);
            }
            else if (tempPrice == k.priceTotal()){
                khList.add(k);
            }
        }
        return khList;
    }
}



