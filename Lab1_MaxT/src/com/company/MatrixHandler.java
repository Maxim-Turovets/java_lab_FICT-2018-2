package com.company;

public class MatrixHandler {
    private int sizematrix;
    private  float [][] matrix;


    public void setSizematrix(int sizematrix) {
        this.sizematrix = sizematrix;
    }
    public  int getSizematrix()
    {
        return  this.sizematrix;
    }

    public float[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(float[][] matrix) {
        this.matrix = matrix;
    }
}
