public class User extends Person {

    private  CreditCard creditCard;
    private  Account account ;

    User (){
        this.creditCard.setActive(true);
        this.creditCard.setBalance(9999);

        this.account.setBalance(9999)
        this.account.setNumber(1234);
    }

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
