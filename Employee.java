package exam;

public class Employee extends Customer implements Discountable{
    private final double discount = .10;

    public static void printEmployeePriceAfterDiscount() {

    }

    @Override
    public double calculateDiscount() {
        return 0;
    }
}
