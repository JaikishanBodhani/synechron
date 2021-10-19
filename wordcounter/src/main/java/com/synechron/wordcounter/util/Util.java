package com.synechron.wordcounter.util;

import org.springframework.stereotype.Component;

@Component
public class Util {
	public static boolean isStringOnlyAlphabet(String str)
	{
	    return ((!str.equals(""))
	            && (str != null)
	            && (str.matches("^[a-zA-Z]*$")));
	}
}
