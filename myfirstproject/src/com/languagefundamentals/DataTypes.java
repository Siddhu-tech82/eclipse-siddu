package com.languagefundamentals;

import java.math.BigInteger;

public class DataTypes {
//	type mismatch : cannot convert from int to biginteger
//	 BigInteger bi =100;
//    BigDecimal bd =	200;
	
	
	
	
	BigInteger bi = new BigInteger("100");
	
	public static void main(String[] args) {
		System.out.println("main method started ");
		DataTypes dt = new DataTypes ();
		System.out.println(dt.bi);

		
	}

}
