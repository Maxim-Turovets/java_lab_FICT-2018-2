package com.company;

public class MatrixHandler {
    private final int sizematrix = 3;
    private float[][] matrix;


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
                this.matrix[n][i] = tempMatrix[i][j];
                n--;
            }
            n = sizematrix-1;
        }
    }


}
