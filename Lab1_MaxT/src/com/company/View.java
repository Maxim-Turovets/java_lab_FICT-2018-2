package com.company;

public class View {
    public  void printMatrix(float [][]matrix, int matrixSize)
    {
        for (int i=0;i<matrixSize;i++)
        {
            for (int j = 0;j<matrixSize;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

}
