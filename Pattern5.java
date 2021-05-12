package com.ojas.march1;

public class Pattern5 {

	public static void main(String[] args) {
		String res = "";
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j<= 5; j++) {
				res += " "+i;
			}
			res += "\n";
		}
		 System.out.println(res);
	}
}
