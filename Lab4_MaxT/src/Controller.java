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
        if (this.operation==4)
        {
            UserOperation.PayMent(this.user);
        }
    }




}
