package trung_tam_the_hinh;

public class NonMemberService extends ServicePackage{
    public NonMemberService() {
        super.setBasicFee(200);
        super.setPt(200);
    }
    @Override
    public void print(){

        System.out.println(" -- Goi dich vu Non Member");
        super.print();
        System.out.println("");
    }

    @Override
    public int price() {
        return super.getBasicFee() + super.getPt();
    }
}
