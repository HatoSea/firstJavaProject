package com.company;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [][] matrix= new int [2][5];//we have 2 rows, each rows we have 5 columns
        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[0][2]=3;
        matrix[0][3]=4;
        matrix[0][4]=5;
        matrix[1][0]=5;
        matrix[1][1]=4;
        matrix[1][2]=3;
        matrix[1][3]=2;
        matrix[1][4]=1;
        //Printing multi-dimensional arrays
        System.out.println(Arrays.deepToString(matrix));
        int [][] matrix1= {{1,2,3,4,5},{5,4,3,2,1}};//2 rows, each row we have 5 columns
        //Printing multi-dimensional arrays
        System.out.println(Arrays.deepToString(matrix1));
    }
}
