import java.util.ArrayList;

public class Admin extends Person {

    private  ArrayList<User> UserMass;

    public ArrayList<User> getUserMass() {
        return UserMass;
    }

    public void setUserMass(ArrayList<User> userMass) {
        UserMass = userMass;
    }


}
