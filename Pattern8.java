package com.ojas.march1;

public class Pattern8 {

	public static void main(String[] args) {
		String res = "";
		int count = 1;
		for (int i = 1; i <= 5; i++) {
			count = i;
			for (int j = 1; j <= i; j++) {
				res += " "+count++;
			}
			
			res += "\n";
		}
		System.out.println(res);
	}

}
