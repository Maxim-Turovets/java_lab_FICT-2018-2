public class CreditCard {

    private  int number;
    private  double balance;
    private  boolean active;

    CreditCard (int number, double balance, boolean aсtive)
    {
     this.number=number;
     this.balance=balance;
     this.active = active;
    }

    CreditCard ()
    {
        this.number=1111;
        this.balance=9999;
        this.active = true;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public  boolean getActive()
    {
        return active;
    }
}
