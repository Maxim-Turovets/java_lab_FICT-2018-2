import java.util.Scanner;

public class User extends Person {

    private  CreditCard creditCard=new CreditCard();
    private  Account account= new Account() ;

    User (){
        Scanner in= new Scanner (System.in);
        this.setName(in.nextLine());

        this.creditCard.setActive(true);
        this.creditCard.setBalance(9999);

        this.account.setBalance(9999);
        this.account.setNumber(1234);
    }

    User (String str){
        System.out.println("Введите имя человека");
        Scanner in= new Scanner (System.in);
        this.setName(in.nextLine());

        this.creditCard.setActive(true);
        this.creditCard.setBalance(9999);

        this.account.setBalance(9999);
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
