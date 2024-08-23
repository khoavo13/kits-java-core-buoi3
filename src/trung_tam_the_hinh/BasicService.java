package trung_tam_the_hinh;

public class BasicService extends ServicePackage{
    private int soLop;
    public BasicService(int soLop){
        this.soLop = soLop;
        this.phiDichVu = 500L;
        this.hoTroPT = 100L;
        this.dichVuXongHoi = false;
        this.chiPhiLopHoc = 100L;
    }

    public int getSoLop() {
        return soLop;
    }

    public void setSoLop(int soLop) {
        this.soLop = soLop;
    }

    @Override
    public Long tinhTien(){
        return this.phiDichVu + this.chiPhiLopHoc * this.soLop + this.hoTroPT;
    }
}
