package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MVCMain {

    public static void main(String[] args) {

        Train model = new Train();
        View view = new View();
        TrainController controller = new TrainController(model,view);
        controller.Update();

    }
}
