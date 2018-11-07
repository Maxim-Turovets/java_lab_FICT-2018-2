
public class MVCMain {
    public static void main(String[] args) {
//        User x = new  User();
//        User z = new  User();
//
//        UserOperation.Transfer(z,x,1000);
//        UserOperation.BlocCard(x);
//
//        System.out.println(x.getAccount().getBalance());
//
//        UserOperation.CancelCard(x);
//        System.out.println(x.getAccount().getBalance());

        Controller controller = new Controller();
        controller.UpdateUser();

    }
}
