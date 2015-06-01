package models;

import java.math.BigInteger;

public class Utility {
	
	final private static BigInteger ONE_THOUSAND = new BigInteger("1024"); 

	public static String formatSize(BigInteger size) {
		if (size.compareTo(ONE_THOUSAND) == 1){
			return size.divide(ONE_THOUSAND).toString() + " TB";
		}
		else return size.toString() + " GB";
	}
}
