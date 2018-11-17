import java.util.ArrayList;

public  class UserOperation {

    public static ArrayList<User>UserMass;

 public  static void BlocCard(User user){

     user.getCreditCard().setActive(false);
     System.out.println(user.getName()+" Your card is blocked");
 }

 public  static void CancelCard (User user){
        user.getAccount().setBalance(0);
        System.out.println(user.getName()+" Your card is cansel");
    }


 public  static  void Transfer(User user, int num, double sum) {
     for (int i = 0; i < 11; i++) {
         if (UserMass.get(i).getAccount().getNumber() == num) {
             if (sum < user.getCreditCard().getBalance()) {
                 System.out.println("Сума отправлена " + UserMass.get(i).getName());
                 user.getAccount().addBalance(sum*(-1));
                 UserMass.get(i).getAccount().addBalance(sum);
             }
             else {
                 System.out.println("Не достаточно денег");
                 break;
             }
         } else {

         }
     }
 }

    public  static void PayMent (User user){
     if(user.getCreditCard().getActive()==true)
     {
         Order obj = new Order();

         if (obj.getSum() < user.getCreditCard().getBalance()) {
             user.getCreditCard().setBalance(obj.getSum() * (-1));
             System.out.println("Заказ оплачен");
         } else
             System.out.println("Не достаточно денег");
     }
     else{
         System.out.println("Card is blocked");
     }
    }

    public static void  randPrint(){
     UserMass = new ArrayList<User>();
        ArrayList<String> randStat = new ArrayList<String>();
        randStat.add("Michael");
        randStat.add("Andre");
        randStat.add("Bill");
        randStat.add("John");
        randStat.add("Maxim");
        randStat.add("Nick");
        randStat.add("Josch");
        randStat.add("Javist");
        randStat.add("Web Developer");
        randStat.add("Кто-то");

        for (int i=0;i<10;i++)
        {
            User user = new User("","");
            user.setName(randStat.get(rand(1,9)));
            user.getCreditCard().setBalance(rand(1,9999));
            user.getAccount().setBalance(rand(1,9999));
            user.getAccount().setNumber(rand(1000,9999));
            UserMass.add(user);
        }

        User user = new User("","");
        user.setName("root");
        user.getCreditCard().setBalance(9999);
        user.getAccount().setBalance(9999);
        user.getAccount().setNumber(1234);
        UserMass.add(user);



    }
    public static int rand(int a,int b)
    {
        int random_number = a + (int) (Math.random() * b); // Генерация 1-го числа
        return  random_number;
    }

    public static void BlocAdmin(int num)
    {
        for (int i = 0; i < 11; i++) {
            if (UserMass.get(i).getAccount().getNumber() == num) {
                    System.out.println("Карта пользователя " + UserMass.get(i).getName()+" Была заблокирована");
                UserMass.get(i).getCreditCard().setActive(false);
                }

        }
    }
}
