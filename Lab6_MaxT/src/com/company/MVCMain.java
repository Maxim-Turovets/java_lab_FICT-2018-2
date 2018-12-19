package com.company;

import java.io.IOException;

public class MVCMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Train model = new Train();
        View view = new View();
        TrainController controller = new TrainController(model,view);
        controller.Update();

    }
}
