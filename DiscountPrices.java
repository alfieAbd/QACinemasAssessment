/**
 * Created by Alfie on 4/27/2017.
 *
 * Child class to TicketPrices. Holds methods that calculate and return discount ticket prices. (( MODEL ))
 *
 */

public class DiscountPrices extends TicketPrices {

    private int discountStandard;
    private int discountOAP;
    private int discountStudent;
    private int discountChild;
    private int calcDisStandard;
    private int calcDisOAP;
    private int calcDisStudent;
    private int calcDisChild;
    private int calcDisTotal;

    //Class constructor

    public DiscountPrices() {
        super();
    }

    //Methods that will be used for the calculation of discounted ticket prices.

    public void calcDiscountStandard(int a, int b){
        calcDisStandard = a * b;
    }

    public void calcDiscountOAP(int a, int b){
        calcDisOAP = a * b;
    }

    public void calcDiscountStudent(int a, int b){
        calcDisStudent = a * b;
    }

    public void calcDiscountChild(int a, int b){
        calcDisChild = a * b;
    }

    public void calcTotal(int a, int b, int c, int d) {

        calcDisTotal = a + b + c + d;

    }

    // Methods to calculate and return discounted ticket prices.

    public int getDiscountStandard() {

        discountStandard = getStandard() - 2;

        return discountStandard;
    }

    public int getDiscountOAP() {

        discountOAP = getOAP() - 2;

        return discountOAP;
    }

    public int getDiscountStudent() {

        discountStudent = getStudent() - 2;

        return discountStudent;
    }

    public int getDiscountChild() {

        discountChild = getChild() - 2;

        return discountChild;
    }

    public int getCalcDisTotal() {

        return calcDisTotal;

    }

    public int getCalcDisStandard() {
        return calcDisStandard;
    }

    public int getCalcDisOAP() {
        return calcDisOAP;
    }

    public int getCalcDisStudent() {
        return calcDisStudent;
    }

    public int getCalcDisChild() {
        return calcDisChild;
    }


}
