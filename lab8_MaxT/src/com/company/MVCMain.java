package com.company;
public class MVCMain {

    public static void main(String[] args) throws Exception {


        Train model = new Train();
        View view = new View();
        TrainController controller = new TrainController(model,view);
        controller.Update();

    }
}
