package com.company;

public class MVCMain {

    public static void main(String[] args) {
    MatrixHandler model = new MatrixHandler();
    View view = new View();
    MatrixHandlerController  controller = new MatrixHandlerController(model,view);

    controller.updateView();
    System.out.print("===========================\n");
    model.rotatingMatrix();
    controller.updateView();


    }
}
