package ch.bbw.pr.rekursionzozoi;

/**
 * @author Marc Welz
 * @version 07.12.2021
 */
public class Calculator {

	void rekursivAufgabe1(int a, int b, int c){
		if(a < c) {
			System.out.print(a*b + " ");
			rekursivAufgabe1(a+1, b+1, c);
		}
		System.out.println();
	}

	void loopAufgabe1(int a, int b, int c){
		while(a < c) {
			System.out.print(a*b + " ");
			a++;
			b++;
		}
		System.out.println();
	}

	//Aufgabe 3:
	//------------------------------------------
	//Diese Methode nicht aendern!!
	public String charToCodeByLoop(char character) {
		char[] chars = {'a', 'e', 'i', 's', 'r', 'n', 't', 'd', 'h', 'u', 'l', 'h', 'b', '.'};
		String[] code = {"000", "001", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
		StringBuilder retVal = new StringBuilder();
		for(int index=0; index< chars.length; index++) {
			if(chars[index] == character) {
				retVal.append(code[index]).append(" ");
				break;
			}
		}
		return retVal.toString();
	}

	//Diese Methode nicht aendern!!
	public String packString(String text) {
		StringBuilder retVal = new StringBuilder();
		for (int i=0; i< text.length(); i++) {
			retVal.append(charToCodeByLoop(text.charAt(i)));
		}
		return retVal.toString();
	}

	public String charToCodeAufgabe3(char character, int index) {
		char[] chars = {'a', 'e', 'i', 's', 'r', 'n', 't', 'd', 'h', 'u', 'l', 'h', 'b', '.'};
		String[] code = {"000", "001", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
		StringBuilder retVal = new StringBuilder();

		if(chars[index] == character) {
			retVal.append(code[index]);
			return retVal.toString();
		}
		return charToCodeAufgabe3(character, index + 1);
	}

	//packStringAufgabe3
	//Aufruf von charToCodeAufgabe3 ergaenzen
	public String packStringAufgabe3(String text) {
		StringBuilder retVal = new StringBuilder();
		for (int index=0; index< text.length(); index++) {
			retVal.append(charToCodeAufgabe3(text.charAt(index), 0)).append(" ");
		}
		return retVal.toString();
	}

	//Aufgabe 4:
	//------------------------------------------
	//packStringAufgabe4
	//Methode ergänzen
	public String packStringAufgabe4(String text, String finalText, int textIndex, int index ) {
		char[] chars = {'a', 'e', 'i', 's', 'r', 'n', 't', 'd', 'h', 'u', 'l', 'h', 'b', '.'};
		String[] code = {"000", "001", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
		StringBuilder retVal = new StringBuilder();

		if(textIndex == text.length() || index > chars.length) {
			return finalText;
		}

		if(chars[index] == text.charAt(textIndex)) {
			retVal.append(code[index]);
			finalText += retVal.toString() + " ";
			return packStringAufgabe4(text, finalText, textIndex +1, 0);
		}

		return packStringAufgabe4(text, finalText, textIndex, index + 1);
	}

}
