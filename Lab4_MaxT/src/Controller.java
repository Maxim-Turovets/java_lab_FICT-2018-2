public class Controller {
    private  View view;
    private  User user;
    private int operation;

    Controller (View view, User user){
        this.view= view;
        view.RegisterUser();
        this.user=user;
    }
    Controller (){

        this.view= new View();
        view.RegisterUser();
        this.user=new User();
        this.operation=view.UserMenu();
    }


    public  void UpdateUser()
    {
        UserOperation.randPrint();
        for (int i=0;i<10;i++)
        {
            view.UserInfo(UserOperation.UserMass.get(i));
        }
        if (this.operation==4)
        {
            view.UserInfo(this.user);
            UserOperation.PayMent(this.user);
            view.UserInfo(this.user);
        }

        if (this.operation==3)
        {
            view.UserInfo(this.user);
//            User us2 = new User("");

            UserOperation.Transfer(this.user,view.setNum(),view.Transfer());
            view.UserInfo(this.user);
        }
    }




}
