package com.test.question.j;

public class Q10053 {

/*
 How code execution works...
result printed from left to right first before moving on the next line. meaning...
it's not -> prints times table for 2 altogether first and then move on to times table for 3
-------------
	2x1=2
	2x2=4
	2x3=6
	...
	2x9=18
-------------
*/

/*
 How code execution works... (continued)
it's -> prints first sets of times table for 2, 3, 4, 5...
and then prints second sets of times table for 2, 3, 4, 5...
-------------------------------------
	2x1=2	3x1=3	4x1=4	5x1=5

-------------------------------------


and then prints second sets of times table for 2, 3, 4, 5...
-------------------------------------
	2x1=2	3x1=3	4x1=4	5x1=5
	2x2=4	3x2=6	4x2=8	5x2=10

-------------------------------------
rinse and repeat!
 */
	
	public static void main(String[] args) {
		
		
		for (int i=1; i<=19; i++) {
			if (i>=1 && i<10) {			
				for (int j=1; j<=4; j++) {
					System.out.printf("%2d x%2d = %2d\t", j+1, i, (j+1) * i);
				}
			} else if (i==10) {
					System.out.println();
					continue;
			} else if (i>=1 && i<20) {
				for (int j=1; j<=4; j++)
					System.out.printf("%2d x%2d = %2d\t", j+5, i%10, (j+5) * (i%10));
			}
			System.out.println();		
		}
	}
}
			
