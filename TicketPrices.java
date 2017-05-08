import java.time.DayOfWeek;

/**
 * Created by Alfie on 4/27/2017.
 *
 * Java class to hold prices set for tickets by QA cinemas. (( MODEL ))
 * Will also serve as parent class for discount prices.
 *
 */
public class TicketPrices {

    private int standard = 8;
    private int OAP = 6;
    private int student = 6;
    private int child = 4;
    private String day;
    private int calcStandard;
    private int calcOAP;
    private int calcStudent;
    private int calcChild;
    private int calcTotal;

    // Class constructor

    public TicketPrices(){
        this.standard = standard;
        this.OAP = OAP;
        this.student = student;
        this.child = child;
    }

    public void calcStandard(int a, int b) {
        calcStandard = a * b;
    }

    public void calcOAP(int a, int b) {
        calcOAP = a * b;
    }

    public void calcStudent(int a, int b) {
        calcStudent = a * b;
    }

    public void calcChild(int a, int b) {
        calcChild = a * b;
    }

    public void calcTotal(int a, int b, int c, int d) {

        calcTotal = a + b + c + d;

    }

    // Getter methods.

    public int getStandard() {
        return standard;
    }

    public int getOAP() {
        return OAP;
    }

    public int getStudent() {
        return student;
    }

    public int getChild() {
        return child;
    }

    public int getCalcTotal() {

        return calcTotal;

    }

    public int getCalcStandard() {
        return calcStandard;
    }

    public int getCalcOAP() {
        return calcOAP;
    }

    public int getCalcStudent() {
        return calcStudent;
    }

    public int getCalcChild() {
        return calcChild;
    }



}
