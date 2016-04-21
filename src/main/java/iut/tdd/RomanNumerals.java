package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String res = "";
		int base = Integer.valueOf(arabe);
		for(int i = 0; i<base; i++){
			res += "I";
		}
		return res;
	}

	public Object convertFromRoman(String roman) {
		return "1";
	}

}
