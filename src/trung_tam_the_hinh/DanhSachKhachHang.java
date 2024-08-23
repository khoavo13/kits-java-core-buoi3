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
        for (KhachHang k : arr) {
            k.print();
            System.out.println("Tinh tien " + k.tongGia());
        }
    }

    public Long findMaxGia(){
        Long t = 0L;
        for(KhachHang k : this.arr){
            t = Math.max(t, k.tongGia());
        }
        return t;
    }

    public List<KhachHang> findMaxSpendMoneyClient() {
        List<KhachHang> khList = new ArrayList<>();
        Long maxGia = findMaxGia();
        for (KhachHang k : this.arr) {
            if(maxGia.equals(k.tongGia())){
                khList.add(k);
            }
        }
        return khList;
    }
}



