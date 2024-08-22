package trung_tam_the_hinh;

public class PremiumService extends ServicePackage {
    private int service;
    private int classFee;

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public PremiumService(){
        this.classFee=0;
        this.service = 0;
        super.setBasicFee(1000);
        super.setPt(0);
    }
    @Override
    public void print(){
        System.out.println(" -- Goi dich vu Premium");
        super.print();
        System.out.println(" -- Chi phi lop hoc: " + this.classFee);
    }

    @Override
    public int price() {
        return super.getBasicFee();
    }
}
