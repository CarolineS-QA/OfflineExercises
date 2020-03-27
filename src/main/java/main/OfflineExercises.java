package main;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") returns "TTThhheee"
	// multChar("AAbb") returns "AAAAAAbbbbbb"
	// multChar("Hi-There") returns "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
//		int i = 0;
//		for (i = 0; i = input.length(); i++) {
		String firstChar = input.substring(0, 0 + 1);
		String secondChar = input.substring(1, 1 + 1);
		String thirdChar = input.substring(2, 2 + 1);
//		String forthChar = input.substring(3, 3 + 1);
		String allChars = firstChar.repeat(3) + secondChar.repeat(3) + thirdChar.repeat(3);
		// Yes this is clunky and doesn't even work. :( trying to get loop to work
		return allChars;
	}
//		return "";
//	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") returns "evilc"
	// getBert("xxbertfridgebertyy") returns "egdirf"
	// getBert("xxBertfridgebERtyy") returns "egdirf"
	// getBert("xxbertyy") returns ""
	// getBert("xxbeRTyy") returns ""

	public String getBert(String input) {
		if (input.contains("bert")) {
			String[] forwards = input.split("bert");
			String transition = forwards.toString();
			// stuck here.
			return "" + transition;
		}
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) returns true
	// evenlySpaced(4, 6, 2) returns true
	// evenlySpaced(4, 6, 3) returns false
	// evenlySpaced(4, 60, 9) returns false

	public boolean evenlySpaced(int a, int b, int c) {
		int smallMedDiff = 0;
		int medLargeDiff = -2;

		if (a < b && b > c) { // if b is biggest
			if (a > c) {// a is middle
				medLargeDiff = b - a;
				smallMedDiff = a - c;
			} else { // c is middle
				medLargeDiff = b - c;
				smallMedDiff = c - a;
			}
		}

		if (a < c && c > b) { // if c is biggest
			if (b > a) { // b is middle
				medLargeDiff = c - b;
				smallMedDiff = b - a;
			} else { // a is middle
				medLargeDiff = c - a;
				smallMedDiff = a - b;
			}
		}

		if (b < a && a > c) // if a is biggest... N/A in tests
			if (b > c) { // b is middle
				medLargeDiff = a - b;
				smallMedDiff = b - c;
			} else { // c is middle
				medLargeDiff = a - c;
				smallMedDiff = c - b;
			}

		if (smallMedDiff == medLargeDiff) {
			return true;
		} else {
			return false;
		}
	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) returns "Ho"
	// nMid("Chocolate", 3) returns "Choate"
	// nMid("Chocolate", 1) returns "Choclate"

	public String nMid(String input, int a) {
//		int middle = input.length()/2; // is 2 (rounds down)
//		int remove = middle - a;
		input.substring(0, input.length()); // all of string
		input.replace(input, input.substring(0) + input.substring(input.length())); // first and last char
		return "";
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") returns true
	// endsDev("wehateDev") returns true
	// endsDev("everoyonehatesdevforreal") returns false
	// endsDev("devisnotcool") returns false

	public boolean endsDev(String input) {
//		if (input.endsWith("dev") || input.endsWith("Dev")) {
//			return true;
//		} // also works
		String nocase = input.toLowerCase();
		if (nocase.endsWith("dev")) {
			return true;
		}
		return false;
	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") returns 2
	// superBlock("abbCCCddDDDeeEEE") returns 3
	// superBlock("") returns 0

	public int superBlock(String input) {
		return -1;
	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") returns 1
	// amISearch("I am in Amsterdam am I?") returns 2
	// amISearch("I have been in Amsterdam") returns 0

	public int amISearch(String arg1) {
		String nocase = arg1.toLowerCase();
		if (nocase.contentEquals("am")) {
			int total = 1; // will only count if it's there not number of instances...
			return total;
		}
		return 0;

	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) returns "fizz"
	// fizzBuzz(10) returns "buzz"
	// fizzBuzz(15) returns "fizzbuzz"

	public String fizzBuzz(int arg1) {
		if (arg1 % 3 == 0) { // by 3 yes
			if (arg1 % 5 == 0) { // 5 and 3
				return "fizzbuzz";
			} else { // 3 only
				return "fizz";
			}
		}
		if (arg1 % 5 == 0) { // 5 yes
			return "buzz";
		} else { // not 3 or 5
			return null;
		}
	}

	// Given a string, split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") returns 14
	// largest("15 72 80 164") returns 11
	// largest("555 72 86 45 10") returns 15

	public int largest(String arg1) {
		String[] array = arg1.split(" ");
		int numberOfNumbers = array.length; // should be 3, 4, 5
		for (int i = 0; i >= numberOfNumbers; i++) {
			String numbers = array[i];
			int digits = Integer.parseInt(numbers);
			// convert each aNumber into it's digits....
//			if (digits%10 !=0) {
//				digits%10 + 
			// for adding digits I found some math, like remainder of 10 is one num,
			// sumOfDigits = digits!=0 {
			// sumOfDigits+=%10; digits/=10; sumOfDigits(digits);
			// }
		}
		// started with this but moved to a for loop for numberOfNumbers
//		int firstNum = Integer.parseInt(array[0]);
//		int secondNum = Integer.parseInt(array[1]);
//		int thridNum = Integer.parseInt(array[2]);
		return 0;

	}

}
