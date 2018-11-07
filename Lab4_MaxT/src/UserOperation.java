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
     Order obj = new Order();
     for (int i = 0; i < 10; i++) {
         if (UserMass.get(i).getAccount().getNumber() == num) {
             if (obj.getSum() < user.getCreditCard().getBalance())
                 System.out.println("Сума отправлена " + UserMass.get(i).getName());
             else {
                 System.out.println("Не достаточно денег");
                 break;
             }
         } else {

         }
     }
 }

    public  static void PayMent (User user){
        Order obj = new Order();
        if (obj.getSum()<user.getCreditCard().getBalance()) {
            user.getCreditCard().setBalance(obj.getSum() * (-1));
            System.out.println("Заказ оплачен");
        }
        else
        System.out.println("Не достаточно денег");
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




    }
    public static int rand(int a,int b)
    {

        int random_number = a + (int) (Math.random() * b); // Генерация 1-го числа
        return  random_number;
    }
}
