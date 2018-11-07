public class User extends Person {

    private  CreditCard creditCard;
    private  Account account;

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account  getAccount(){
        return account;
    }


}
