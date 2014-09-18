package ru.patashnik.projecteuler.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem18 implements Problem {
    @Override
    public int getNumber() {
        return 18;
    }

    @Override
    public String getTitle() {
        return "Maximum path sum I";
    }

    @Override
    public String solve() {
        int[][] matrix = {
            {75},
            {95, 64},
            {17, 47, 82},
            {18, 35, 87, 10},
            {20,  4, 82, 47, 65},
            {19,  1, 23, 75,  3, 34},
            {88,  2, 77, 73,  7, 63, 67},
            {99, 65,  4, 28,  6, 16, 70, 92},
            {41, 41, 26, 56, 83, 40, 80, 70, 33},
            {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
            {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
            {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
            {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
            {63, 66,  4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
            { 4, 62, 98, 27, 23,  9, 70, 98, 73, 93, 38, 53, 60,  4, 23}
        };
        
		for (int i = matrix.length - 2; i >= 0; i--) {
            for (int j = 0; j < matrix[i].length; j++) {
                int left = matrix[i][j] + matrix[i+1][j];
                int right = matrix[i][j] + matrix[i+1][j+1];
				matrix[i][j] = (left > right) ? left : right;
            }
        }

        return String.valueOf(matrix[0][0]);
    }
}

