package iut.tdd;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void should_return_roman_for_unit () {
		testConvertToRoman("1", "I");
		testConvertToRoman("3", "III");
		testConvertToRoman("4", "IV");
		testConvertToRoman("5", "V");
	}

	private void testConvertToRoman(String input, String expected) {
		Assert.assertEquals(expected, new RomanNumerals().convertToRoman(input));
	}
	
}
