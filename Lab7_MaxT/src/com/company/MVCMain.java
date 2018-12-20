package com.company;

public class MVCMain {


    public static void main(String[] args) {

        MyList model = new MyList<String>();
        View view = new View();

        Controller controller = new Controller(model,view);
        controller.update();
    }

}
