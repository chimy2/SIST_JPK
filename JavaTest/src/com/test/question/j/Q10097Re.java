package com.test.question.j;

public class Q10097Re {

	 public static void main(String[] args) {
	        int size = 5;
	        int[][] matrix = new int[size][size];
	        int value = 1;

	        // Single double-for loop to fill the matrix
	        for (int sum = 0; sum < size * 2 - 1; sum++) {
	            for (int i = 0; i < size; i++) {
	                int j = sum - i;
	                if (j >= 0 && j < size) {
	                    matrix[i][j] = value++;
	                }
	            }
	        }

	        // Print the matrix
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                System.out.printf("%2d ", matrix[i][j]);
	            }
	            System.out.println();
	        }
	    }
	}

	
/*	public static void main(String[] args) {
        int size = 5;  // The size of our box is 5 rows and 5 columns
        int[][] matrix = new int[size][size];  // Create an empty box
        int value = 1;  // Start with the number 1

        // Step 1: Fill the upper part of the box (from the top row)
        for (int col = 0; col < size; col++) {  // Go through each column of the top row
            int i = 0;  // Start from the top row
            int j = col;  // Start from the current column
            while (j >= 0 && i < size) {  // While we are inside the box
                matrix[i][j] = value++;  // Put the number in the box and move to the next number
                i++;  // Move one step down
                j--;  // Move one step left
            }
        }

        // Step 2: Fill the lower part of the box (from the rightmost column)
        for (int row = 1; row < size; row++) {  // Go through each row of the rightmost column
            int i = row;  // Start from the current row
            int j = size - 1;  // Start from the last column
            while (i < size && j >= 0) {  // While we are inside the box
                matrix[i][j] = value++;  // Put the number in the box and move to the next number
                i++;  // Move one step down
                j--;  // Move one step left
            }
        }

        // Step 3: Print the box
        for (int i = 0; i < size; i++) {  // Go through each row
            for (int j = 0; j < size; j++) {  // Go through each column in the row
                System.out.printf("%2d ", matrix[i][j]);  // Print the number in the box
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}*/