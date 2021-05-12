package com.ojas.march1;

public class Pattern9 {

	public static void main(String[] args) {
		String res = "";
		int count = 0;
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				count = count +1; 
				System.out.print(" "+count);
			}
			System.out.println();
     }
   }
}
