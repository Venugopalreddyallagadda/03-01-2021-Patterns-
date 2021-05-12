package com.ojas.march1;

public class Pattern10 {

	public static void main(String[] args) {
		String res = "";
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				res += " "+i;
			}
			res += "\n";
		}
		System.out.println(res);
	}
}
