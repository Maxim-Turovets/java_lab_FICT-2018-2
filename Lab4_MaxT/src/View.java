import java.util.Scanner;

public class View {

    public void RegisterUser(){

        System.out.println("Кто вы?");
        System.out.println("Введите свое имя ");

    }

    public int UserMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("Заблокировать карту - 1    Анулировать карту - 2  Сделать перевод другому человеку - 3  Оплатить заказ - 4");
        int num = in.nextInt();
        return  num;
    }

    public void UserInfo(User user){
        System
    }

}
