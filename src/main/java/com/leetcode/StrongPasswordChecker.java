package com.leetcode;

/**
 * Strong Password Checker
 * <p>
 * A password is considered strong if the below conditions are all met:
 * <p>
 * It has at least 6 characters and at most 20 characters.
 * It contains at least one lowercase letter, at least one uppercase letter, and at least one digit.
 * It does not contain three repeating characters in a row (i.e., "Baaabb0" is weak, but "Baaba0" is strong).
 * Given a string password, return the minimum number of steps required to make password strong. if password is already strong, return 0.
 * <p>
 * In one step, you can:
 * <p>
 * Insert one character to password,
 * Delete one character from password, or
 * Replace one character of password with another character.
 * <p>
 * Constraints:
 * <p>
 * 1 <= password.length <= 50
 * password consists of letters, digits, dot '.' or exclamation mark '!'.
 *
 * https://leetcode.com/problems/strong-password-checker/
 */
public class StrongPasswordChecker {
	
	public static int strongPasswordChecker(String password) {
		int minimumRequiredSteps = 0;
		
		int numberOfDigits = 0;
		int numberOfLowerCase = 0;
		int numberOfUpperCase = 0;
		int repeatCharacters = 0;
		
		int i = 0;
		int currentChar = 0;
		int countRowOfCurrentChar = 1;
		while (i < password.length()) {
			char c = password.charAt(i);
			
			if (isNumber(c)) {
				++numberOfDigits;
			} else if (isLowerCaseAbc(c)) {
				++numberOfLowerCase;
			} else if (isUpperCaseAbc(c)) {
				++numberOfUpperCase;
			}
			
			if (currentChar == c) {
				++countRowOfCurrentChar;
				if (countRowOfCurrentChar == 3) {
					++repeatCharacters;
				}
			} else {
				currentChar = c;
				countRowOfCurrentChar = 1;
			}
			++i;
		}
		
		// Deccision
		if (numberOfDigits < 1) {
			minimumRequiredSteps += 1;
		}
		
		if (numberOfLowerCase < 1) {
			minimumRequiredSteps += 1;
		}
		
		if (numberOfUpperCase < 1) {
			minimumRequiredSteps += 1;
		}
		
		if (repeatCharacters > 0) {
			int rCh = repeatCharacters;
			if (numberOfLowerCase == 0) rCh -= 1;
			if (numberOfDigits == 0) rCh -= 1;
			if (numberOfUpperCase == 0) rCh -= 1;
			if (rCh > 0) {
				minimumRequiredSteps += rCh;
			}
		}
		
		// Number to Delete
		if (password.length() > 20) {
			minimumRequiredSteps += password.length() - 20;
		}
		
		// Number to Add
		if (password.length() < 6) {
			int missedChars = 6 - password.length();
			if (numberOfLowerCase == 0) missedChars -= 1;
			if (numberOfDigits == 0) missedChars -= 1;
			if (numberOfUpperCase == 0) missedChars -= 1;
			if (repeatCharacters > 0) minimumRequiredSteps-=repeatCharacters;
			if (missedChars > 0) {
				minimumRequiredSteps += missedChars;
			}
		}
		
		return minimumRequiredSteps;
	}
	
	public static boolean isUpperCaseAbc(int character) {
		return character >= 'A' && character <= 'Z';
	}
	
	public static boolean isLowerCaseAbc(int character) {
		return character >= 'a' && character <= 'z';
	}
	
	public static boolean isNumber(int character) {
		return character >= '0' && character <= '9';
	}
}
