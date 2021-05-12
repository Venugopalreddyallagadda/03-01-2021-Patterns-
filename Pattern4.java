package com.ojas.march1;

public class Pattern4 {

	public static void main(String[] args) {
		String res = "";
		for(int i = 1; i<=5; i++) {
			for (int j = 5; j >= 1; j--) {
				res += " "+j;
			}
			res += "\n";
		}
		System.out.println(res);		
	}
}
