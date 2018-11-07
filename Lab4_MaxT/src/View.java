import java.util.Scanner;

public class View {

    public int RegisterUser(){

        System.out.println("Кто вы?  1-Пользователь 2-Админ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num==1) {
            System.out.println("Введите свое имя ");
        }
        return  num;

    }

    public int UserMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("Заблокировать карту - 1    Анулировать карту - 2  Сделать перевод другому человеку - 3  Оплатить заказ - 4");
        int num = in.nextInt();
        return  num;
    }

    public void UserInfo(User user){
        System.out.println("\nСума на счете: " + user.getAccount().getBalance()+"\nСума на карте "+ user.getCreditCard().getBalance()+ "\nИмя владельца "+user.getName()+ "\nНомер счета "+user.getAccount().getNumber());
    }

    public double Transfer()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите суму платежа");
        double num = in.nextDouble();
        return  num;
    }
    public int setNum()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер счета получателя");
        int num = in.nextInt();
        return  num;
    }

    public int AdminMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("Посмотреть список пользователей - 1    Заблокировать карту - 2");
        int num = in.nextInt();
        return  num+4;
    }

    public int setBlockNum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер карты для блокировки ");
        int num = in.nextInt();
        return  num;
    }

    public String setName(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя ");
        String name = in.nextLine();
        return  name;
    }
    public int setAccoutnNum()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер своего счета");
        int num = in.nextInt();
        return  num;
    }

}
