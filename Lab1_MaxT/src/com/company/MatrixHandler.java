package com.company;

public class MatrixHandler {
    private  int sizematrix = 6;
    private float[][] matrix;


    public MatrixHandler(int size) {
        try {
            this.sizematrix = size;
        }
        catch (Exception e)
        {
            System.out.print(e.getMessage());
        }
        this.matrix = new float[this.sizematrix][this.sizematrix];

        for (int i = 0; i < sizematrix; i++) {
            for (int j = 0; j < sizematrix; j++) {
                matrix[i][j] = (float) (Math.random()*100);
            }
        }
    }
    public MatrixHandler() {
        this.matrix = new float[this.sizematrix][this.sizematrix];

        for (int i = 0; i < sizematrix; i++) {
            for (int j = 0; j < sizematrix; j++) {
                matrix[i][j] = (float) (Math.random()*100);
            }
        }
    }

    public int getSizematrix() {
        return sizematrix;
    }

    public float[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(float[][] matrix) {
        this.matrix = matrix;
    }

    public void rotatingMatrix() {
        float[][] tempMatrix = new float[this.sizematrix][this.sizematrix];

        for (int i = 0; i < sizematrix; i++) {
            for (int j = 0; j < sizematrix; j++) {
                tempMatrix[i][j]=matrix[i][j];
            }
        }
        int n = sizematrix-1;
        for (int i = 0; i < sizematrix; i++)
        {
            for (int j = 0; j < sizematrix; j++)
            {
                float temp = this.matrix[i][j];
                this.matrix[i][j] = tempMatrix[j][i];
                n--;
            }
         //   n = sizematrix-1;
        }
    }

    private void  swapElement(float a , float b)
    {
        float c;

    }


}
