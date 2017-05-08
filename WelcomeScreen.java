import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by Alfie on 5/3/2017.
 *
 * (( VIEW )) ~  Welcome page for system
 *
 */
public class WelcomeScreen extends JFrame {

    //Initialize all components

    private JLabel welcomeMsg = new JLabel("Welcome to QA Cinemas");
    private JLabel label1 = new JLabel("Please select the day");
    private JCheckBox monday = new JCheckBox("Monday");
    private JCheckBox tuesday = new JCheckBox("Tuesday");
    private JCheckBox wednesday = new JCheckBox("Wednesday");
    private JCheckBox thursday = new JCheckBox("Thursday");
    private JCheckBox friday = new JCheckBox("Friday");
    private JCheckBox saturday = new JCheckBox("Saturday");
    private JCheckBox sunday = new JCheckBox("Sunday");


    Purchases purchases = new Purchases();
    PurchasesDiscount purchasesDiscount = new PurchasesDiscount();
    TicketPrices ticketPrices = new TicketPrices();
    DiscountPrices discountPrices = new DiscountPrices();


    public WelcomeScreen() {

        //Create JPanel and add components.

        JPanel panel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,250);
        constructComponents(panel);

        this.add(panel);

    }

    //Create components and set at specific positions. Itemlisteners added to each JCheckbox to execute different operations.

    private void constructComponents(JPanel panel) {

        panel.setLayout(null);

        welcomeMsg.setBounds(200,20,300,10);
        panel.add(welcomeMsg);
        label1.setBounds(210,50,300,15);
        panel.add(label1);
        monday.setBounds(50,80,100,15);
        monday.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    new SystemController(ticketPrices,purchases);
                    purchases.setVisible(true);
                }
            }
        });
        panel.add(monday);
        tuesday.setBounds(150,80,80,15);
        tuesday.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    new SystemController(ticketPrices,purchases);
                    purchases.setVisible(true);
                }
            }
        });
        panel.add(tuesday);
        wednesday.setBounds(240,80,100,15);
        wednesday.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    new SystemController(discountPrices,purchasesDiscount);
                    purchasesDiscount.setVisible(true);
                }
            }
        });
        panel.add(wednesday);
        thursday.setBounds(350,80,100,15);
        thursday.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    new SystemController(ticketPrices,purchases);
                    purchases.setVisible(true);
                }
            }
        });
        panel.add(thursday);
        friday.setBounds(450,80,100,15);
        friday.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    new SystemController(ticketPrices,purchases);
                    purchases.setVisible(true);
                }
            }
        });
        panel.add(friday);
        saturday.setBounds(200,110,100,15);
        saturday.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    new SystemController(ticketPrices,purchases);
                    purchases.setVisible(true);
                }
            }
        });
        panel.add(saturday);
        sunday.setBounds(300,110,100,15);
        sunday.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    new SystemController(ticketPrices,purchases);
                    purchases.setVisible(true);
                }
            }
        });
        panel.add(sunday);

    }


}
