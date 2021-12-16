package ch.bbw.pr.textverschluesselung;

/**
 * Algorithm
 * Bietet Algorithmen fuer die ersten
 * einfachen Uebungen an.
 * @author Peter Rutschmann
 * @version 26.08.2020
 */
public class Algorithm {
	static public String disguise(String input) {
		//Hier ergänzen Aufgabe 1

		String result = "";

		while(input.length() > 0) {
			result += input.charAt(input.length()-1);
			input = input.substring(0, input.length() - 1);
		}

		return result;
	}
	
	static public String toUpper(String input) {
		//Hier ergänzen Aufgabe 2

		String result = "";
		char letters[] = input.toCharArray();
		char ch = ' ';
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] >= 'a' && letters[i] <= 'z') {
				ch = (char)(letters[i] - 32);
				System.out.println((int)letters[i]);
			} else {
				ch = letters[i];
			}
			result += ch;
		}

		return result;
	}
	
	static public String toCeasar(String input) {
		//Hier ergänzen Aufgabe 3

		String result = "";
		char letters[] = input.toCharArray();
		char ch = ' ';
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] >= 'a' && letters[i] <= 'z') {
				if((int)letters[i] >= 99 && (int)letters[i] <= 120) {
					ch = (char)(letters[i] + 3);
				} else {
					int diff = 122 - letters[i];
					ch = (char) (97 + diff);
				}
			} else {
				ch = letters[i];
			}
			result += ch;
		}

		return result;

	}
}
