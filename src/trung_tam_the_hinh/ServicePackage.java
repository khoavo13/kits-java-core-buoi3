package trung_tam_the_hinh;

public abstract class ServicePackage {
    private int basicFee;

    private int pt;

    public ServicePackage(int basicFee, int pt) {
        this.basicFee = basicFee;
        this.pt = pt;
    }

    public ServicePackage() {
    }

    public int getBasicFee() {
        return basicFee;
    }

    public void setBasicFee(int basicFee) {
        this.basicFee = basicFee;
    }

    public int getPt() {
        return pt;
    }

    public void setPt(int pt) {
        this.pt = pt;
    }

    public  void print(){
        System.out.print(" -- Phi dich vụ cơ bản: " + this.basicFee + " -- phí pt: " + this.pt);
    }

    public abstract int price();
}
