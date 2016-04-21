package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String res = "";
		int base = Integer.valueOf(arabe);
		if(base == 0) return "0";
		if(base == 4) return "IV";
		for(int i = 0; i<base; i++){
			res += "I";
		}
		return res;
	}

	public Object convertFromRoman(String roman) {
		return "1";
	}

}
