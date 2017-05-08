import javax.swing.*;
import java.awt.event.ActionListener;


/**
 * Created by Alfie on 4/27/2017.
 * (( VIEW )) for discounted purchase prices.
 *
 */

public class PurchasesDiscount extends JFrame{

    //Initialize all components

    private JLabel Standard = new JLabel("Standard");
    private JLabel standardPrice = new JLabel("£6");
    private JTextField standardQuantity = new JTextField(10);
    private JLabel OAP = new JLabel("OAP");
    private JLabel oapPrice = new JLabel("£4");
    private JTextField oapQuantity = new JTextField(10);
    private JLabel Student = new JLabel("Student");
    private JLabel studentPrice = new JLabel("£4");
    private JTextField studentQuantity = new JTextField(10);
    private JLabel Child = new JLabel("Child");
    private JLabel childPrice = new JLabel("£2");
    private JTextField childQuantity = new JTextField(10);
    private JButton purchase = new JButton("Purchase");
    private JLabel totalLabel = new JLabel("Total Price");
    private JTextField total = new JTextField(10);


    public PurchasesDiscount() {

        //Create JPanel and add the components to it.

        JPanel panel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);

        panel.add(Standard);
        panel.add(standardPrice);
        panel.add(standardQuantity);
        panel.add(OAP);
        panel.add(oapPrice);
        panel.add(oapQuantity);
        panel.add(Student);
        panel.add(studentPrice);
        panel.add(studentQuantity);
        panel.add(Child);
        panel.add(childPrice);
        panel.add(childQuantity);
        panel.add(purchase);
        panel.add(totalLabel);
        panel.add(total);

        this.add(panel);
    }

    //Getter and Setter methods that will be used to retrieve and set data from the model class. Allows user to see results.

    public int getStandardDisQuantity() {
        return Integer.parseInt(standardQuantity.getText());
    }

    public int getOAPDisQuantity() {
        return Integer.parseInt(oapQuantity.getText());
    }

    public int getStudentDisQuantity() {
        return Integer.parseInt(studentQuantity.getText());
    }

    public int getChildDisQuantity() {
        return Integer.parseInt(childQuantity.getText());
    }

    public void setTotal(int totalValue) {
        total.setText(Integer.toString(totalValue));
    }

    public void addActionListener(ActionListener listenDiscountPurchase) {
        purchase.addActionListener(listenDiscountPurchase);
    }


}
