
public class MVCMain {
    public static void main(String[] args) {

    try {
        Controller controller = new Controller();
        controller.UpdateUser();
    }
    catch(Exception e)
    {
        System.out.println("Не правильный ввод");
    }
    }
}
