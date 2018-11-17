package com.company;

public class MVCMain {

    public static void main(String[] args) {

        Train model = new Train();
        View view = new View();
        TrainController controller = new TrainController(model,view);
        controller.Update();

    }
}
