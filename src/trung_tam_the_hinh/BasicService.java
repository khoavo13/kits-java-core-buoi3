package trung_tam_the_hinh;

public class BasicService extends ServicePackage{
    private int classFee;

    public int getClassFee() {
        return classFee;
    }

    public void setClassFee(int classFee) {
        this.classFee = classFee;
    }

    public BasicService(){
       this.classFee=100;
       super.setBasicFee(500);
       super.setPt(100);
   }
   @Override
   public void print(){

        System.out.println("Goi dich vu Basic");
        super.print();
        System.out.println(" -- Chi phi lop hoc: " + this.classFee);
   }

    @Override
    public int price() {
        return this.classFee + super.getBasicFee() + super.getPt();
    }

}
