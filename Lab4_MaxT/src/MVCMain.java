
public class MVCMain {
    public static void main(String[] args) {
        User of = new  User();
        User of2 = new  User();
        User of3 = new  User();

        UserOperation.Transfer(of,of2,100);
        UserOperation.Transfer(of3,of2,300);

        System.out.println(of.getAccount().getBalance());
        System.out.println(of2.getAccount().getBalance());
    }
}
