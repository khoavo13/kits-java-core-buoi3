package trung_tam_the_hinh;

public abstract class ServicePackage {
    protected Long phiDichVu;
    protected Long chiPhiLopHoc;
    protected boolean dichVuXongHoi;
    protected Long hoTroPT;
    public Long tinhTien(){
        return this.phiDichVu + this.chiPhiLopHoc + this.hoTroPT;
    }
}
