package Bank;
public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}
