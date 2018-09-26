package com.company;

public class MatrixHandlerController {

    private MatrixHandler model;
    private View view;

    public  MatrixHandlerController(MatrixHandler model , View view)
    {
        this.model= model;
        this.view= view;
    }



    public  void  setMatric (float[][] matrix){
        model.setMatrix(matrix);
    }

    public  int getMatrixSize ()
    {
        return model.getSizematrix();
    }

    public  float [][] getMatrix()
    {
        return model.getMatrix();
    }

    public  void updateView(){
        view.printMatrix(model.getMatrix(),model.getSizematrix());
    }


}
