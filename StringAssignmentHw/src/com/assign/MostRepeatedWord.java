package com.assign;

public class MostRepeatedWord {

	public static String mostRepeatedWord(String str) {

		String[] words = str.split(" ");

		int maxCount = 0;
		String mostRepeated = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			int count = 1;
			if (word == null) {
				continue;
			}
			for (int j = i + 1; j < words.length; j++) {
				if (word.equals(words[j])) {
					count++;
					words[j] = null;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				mostRepeated = word;
			}
		}

		return mostRepeated;
	}

	public static void main(String[] args) {
		String str = "the quick brown fox jumps over the lazy dog the the the";
		String mostRepeated = mostRepeatedWord(str);
		System.out.println("The most repeated word is: " + mostRepeated);
	}
}
