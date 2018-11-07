public class Account {

    private int number;
    private  double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addBalance(double balance) {
        this.balance += balance;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }
}
