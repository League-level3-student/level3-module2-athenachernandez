package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int pearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i)) {
				pearls++;
			}
		}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		int max = 0;
		String longestWord = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > max) {
				max = words.get(i).length();
				longestWord = words.get(i);
			}
		}
		return longestWord;
	}

	public static boolean containsSOS(List<String> message1) {
		for (int i = 0; i < message1.size(); i++) {
			System.out.println(message1.get(i));
			if (message1.get(i).equals("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		boolean outOfOrder = true;
		while (outOfOrder) {
			for (int i = 0; i < results.size() - 1; i++) {
				outOfOrder = false;
				if (results.get(i) > results.get(i + 1)) {
					double arrayI = results.get(i);
					results.set(i, results.get(i+1));
					results.set(i+1, arrayI);
					outOfOrder = true;
					break;
				}
			}
		}
		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		boolean outOfOrder = true;
		while (outOfOrder) {
			for (int i = 0; i < unsortedSequences.size() - 1; i++) {
				outOfOrder = false;
				if (unsortedSequences.get(i).length() > unsortedSequences.get(i + 1).length()) {
					String arrayI = unsortedSequences.get(i);
					unsortedSequences.set(i, unsortedSequences.get(i+1));
					unsortedSequences.set(i+1, arrayI);
					outOfOrder = true;
					break;
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		boolean outOfOrder = true;
		while (outOfOrder) {
			for (int i = 0; i < words.size() - 1; i++) {
				outOfOrder = false;
				if (words.get(i).length() > words.get(i + 1).length()) {
					String arrayI = words.get(i);
					words.set(i, words.get(i+1));
					words.set(i+1, arrayI);
					outOfOrder = true;
					break;
				}
			}
		}
		return words;
	}
}