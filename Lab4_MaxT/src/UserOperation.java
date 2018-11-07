public  class UserOperation {



 public  static void BlocCard(User user){

     user.getCreditCard().setActive(false);
     System.out.println(user.getName()+" Your card is blocked");
 }

 public  static void CancelCard (User user){
        user.getAccount().setBalance(0);
        System.out.println(user.getName()+" Your card is cansel");
    }


 public  static  void Transfer(User user, User two, double sum)
 {
     if(user.getAccount().getBalance()>0 && two.getAccount().getBalance()>sum) {
         user.getAccount().addBalance(sum * (-1));
         two.getAccount().addBalance(sum);
     }
     else {
         System.out.println("Not Many");
     }
 }

    public  static void PayMent (User user){
        Order obj = new Order();
        if (obj.getSum()<user.getCreditCard().getBalance()) {
            user.getCreditCard().setBalance(obj.getSum() * (-1));
            System.out.println("Заказ оплачен");
        }
        System.out.println("Не достаточно денег");
    }
}
