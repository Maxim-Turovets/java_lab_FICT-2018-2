package com.company;
import java.util.Scanner;

public class MVCMain {

    public static void main(String[] args) {
        int size;
        MatrixHandler model;
        try {
            System.out.println("Enter size matrix:");
            Scanner in = new Scanner(System.in);
            size = in.nextInt();
            model = new MatrixHandler(size);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            model = new MatrixHandler();
        }



    View view = new View();
    MatrixHandlerController  controller = new MatrixHandlerController(model,view);

    controller.updateView();
    System.out.print("===========================\n");
    model.rotatingMatrix();
    controller.updateView();


    }
}
