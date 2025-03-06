package Bank;
public class BPI_Atm {
    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        int amount = 2700; // Amount to be dispensed
        if (amount % 100 != 0) {
            System.out.println("Amount should be in multiples of 100s.");
            
        } else
        atmDispenser.dispense(new Currency(amount));
    }
}
