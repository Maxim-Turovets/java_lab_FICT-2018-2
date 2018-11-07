import java.util.Scanner;

public class Controller {
    private  View view;
    private  User user;
    private  Admin admin;
    private int operation;

    Controller (View view, User user){
        this.view= view;
        view.RegisterUser();
        this.user=user;
    }
    Controller (){
        this.view= new View();
        Or(view.RegisterUser());

    }

    private void Or(int num)
    {
        if(num==1)
        {
            this.user=new User();
            this.operation=view.UserMenu();
        }
        if(num==2)
        {
            this.admin=new Admin();
            this.operation=view.AdminMenu();
        }
    }

    public  void UpdateUser() {
        Scanner instr = new Scanner(System.in);
        String next = "";

        while (next != "n") {
            if (next.equals("n"))
                break;

            if (this.operation == 6) {
                UserOperation.BlocAdmin(view.setBlockNum());
            }

            if (this.operation == 5) {
                UserOperation.randPrint();
                for (int i = 0; i < 10; i++) {
                    view.UserInfo(UserOperation.UserMass.get(i));
                }


            }

            if (this.operation == 4) {
                UserOperation.PayMent(this.user);
                view.UserInfo(this.user);
            }

            if (this.operation == 3) {
                view.UserInfo(this.user);
                UserOperation.Transfer(this.user, view.setNum(), view.Transfer());
                view.UserInfo(this.user);
            }

            if (this.operation == 2) {
                UserOperation.CancelCard(this.user);
            }

            if (this.operation == 1) {
                UserOperation.BlocCard(this.user);
            }

            System.out.println("Нажмите любую кнопку для продолжения  или 'n' для выхода ");
            next = instr.nextLine();
            Or(view.RegisterUser());
        }

    }


}
