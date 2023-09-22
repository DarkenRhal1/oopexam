package exam;

public class Student extends  Customer implements Discountable{
    private long studentID;

    private final double discount= .5;

    @Override
    public double calculateDiscount() {
        return 0;
    }
}
