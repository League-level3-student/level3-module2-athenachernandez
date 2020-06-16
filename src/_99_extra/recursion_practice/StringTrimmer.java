package _99_extra.recursion_practice;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class StringTrimmer {
	
	static public String trimString(String str, int removesLeft) {
		//1. If there are no removes left
		System.out.println(str);
		if (removesLeft == 0) {
			//2.  return the string
			return str;
		}
		//3. Else you need to substring the string by 1, reduce removesLeft by 1, and then return both. 
		str = str.substring(0, str.length()-1);
		removesLeft--;
		return trimString(str, removesLeft);
	}
	
	@Test
	public void test() {
		assertEquals("Hello W", trimString("Hello World!", 5));
		assertEquals("League", trimString("LeagueOfAmazing!", 10));
		assertEquals("James", trimString("JamesTheIntern", 9));
		assertEquals("", trimString("TheWholeWord", 12));
	}
	
}
