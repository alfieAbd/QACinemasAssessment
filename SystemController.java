import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alfie on 4/30/2017.
 *
 * (( CONTROLLER CLASS )) Controls all interactions between the view and model classes.
 * This class also manages the regular and discounted instances that customers will see depending
 * on what day is selected.
 *
 *
 */
public class SystemController {

     TicketPrices ticketPrices;
     DiscountPrices discountPrices;
     Purchases purchases;
     PurchasesDiscount purchasesDiscount;

     //Class constructors which will be used depending on which day is selected by the customer.

    public SystemController(TicketPrices ticketPrices,
                            Purchases purchases) {

        this.ticketPrices = ticketPrices;
        this.purchases = purchases;
        this.purchases.addActionListener(new PurchaseListener());
    }

    public SystemController(DiscountPrices discountPrices,
                            PurchasesDiscount purchasesDiscount) {

        this.discountPrices = discountPrices;
        this.purchasesDiscount = purchasesDiscount;
        this.purchasesDiscount.addActionListener(new DiscountPurchaseListener());
    }

    //Class to implement operations and calculations for pregular ticket purchases.

    class PurchaseListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int standard, oap, student, child;
            int sQuantity, oQuantity,stQuantity, cQuantity;

            try{

                // Retrieve all calculation components

                standard = ticketPrices.getStandard();
                oap = ticketPrices.getOAP();
                student = ticketPrices.getStudent();
                child = ticketPrices.getChild();

                sQuantity = purchases.getStandardQuantity();
                oQuantity = purchases.getOAPQuantity();
                stQuantity = purchases.getStudentQuantity();
                cQuantity = purchases.getChildQuantity();

                // Execute individual calculations

                ticketPrices.calcStandard(standard,sQuantity);
                ticketPrices.calcOAP(oap,oQuantity);
                ticketPrices.calcStudent(student,stQuantity);
                ticketPrices.calcChild(child,cQuantity);

                // Execute total calculations

                ticketPrices.calcTotal(ticketPrices.getCalcStandard(),ticketPrices.getCalcOAP(),ticketPrices.getCalcStudent(),
                        ticketPrices.getCalcChild());

                // Need to send calculations to total and print on UI

                purchases.setTotal(ticketPrices.getCalcTotal());

            }
            catch (NumberFormatException ex) {
                System.out.println(ex);

            }

        }

    }

    //Class to implement operations and calculations for discounted ticket purchases.

    class DiscountPurchaseListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int standard, oap, student, child;
            int sQuantity, oQuantity,stQuantity, cQuantity;

            try{

                // Retrieve all calculation components

                standard = discountPrices.getDiscountStandard();
                oap = discountPrices.getDiscountOAP();
                student = discountPrices.getDiscountStudent();
                child = discountPrices.getDiscountChild();

                sQuantity = purchasesDiscount.getStandardDisQuantity();
                oQuantity = purchasesDiscount.getOAPDisQuantity();
                stQuantity = purchasesDiscount.getStudentDisQuantity();
                cQuantity = purchasesDiscount.getChildDisQuantity();

                // Execute individual calculations

                discountPrices.calcDiscountStandard(standard,sQuantity);
                discountPrices.calcDiscountOAP(oap,oQuantity);
                discountPrices.calcDiscountStudent(student,stQuantity);
                discountPrices.calcDiscountChild(child,cQuantity);

                // Execute total calculations

                discountPrices.calcTotal(discountPrices.getCalcDisStandard(),discountPrices.getCalcDisOAP(),discountPrices.getCalcDisStudent(),
                        discountPrices.getCalcDisChild());

                // Need to send calculations to total and print on UI

                purchasesDiscount.setTotal(discountPrices.getCalcDisTotal());

            }
            catch (NumberFormatException ex) {
                System.out.println(ex);

            }

        }
    }

}
