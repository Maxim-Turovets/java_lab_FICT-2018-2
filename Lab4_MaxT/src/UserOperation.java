public  class UserOperation {



 public  static void BlocCard(User user){
     user.getCreditCard().setActive(false);
 }

 public  static  void Transfer(User user, User two, double sum)
 {
     user.getAccount().setBalance(sum*(-1));
     two.getAccount().setBalance(sum);
 }
}
