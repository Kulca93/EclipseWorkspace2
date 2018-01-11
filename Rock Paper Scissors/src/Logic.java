import java.util.ArrayList;
import java.util.Scanner;

public class Logic {

	String choice = "0";

	int score = 0;

	// String aIScore = "0";

	public int i;

	public void play(AI ai) {

		Scanner userInput = new Scanner(System.in);

		for (int x = 0; x <= 2; x++) {

			String s = userInput.nextLine();

			switch (s) {

			case "rock":

				i = 0;

				break;

			case "paper":

				i = 1;

				break;

			case "scissors":

				i = 2;

				break;

			}

			// int i = userInput.nextInt();

			int aIChoice = ai.aIPlay();

			System.out.println(aIChoice);

			switch (i) {

			case 0:

				if (aIChoice == 0) {

				} else if (aIChoice == 1) {
					ai.aIScore = ai.aIScore + 1;

				} else {
					score = score + 1;

				}

				break;

			// choice = rock

			case 1:

				if (aIChoice == 1) {

				} else if (aIChoice == 2) {
					ai.aIScore = ai.aIScore + 1;

				} else {
					score = score + 1;

				}

				break;

			// choice = paper

			case 2:

				if (aIChoice == 2) {

				} else if (aIChoice == 0) {
					ai.aIScore = ai.aIScore + 1;

				} else {
					score = score + 1;

				}

				break;

			// choice = scissors
			}

			System.out.println("Player Score " + score);
			System.out.println("AI Score " + ai.aIScore);

		}

		userInput.close();

		System.out.println("our score = " + score + " " + " ai score = " + ai.aIScore);

		if (score > ai.aIScore) {

			System.out.println("YOU WIN!");
		} else if (score == ai.aIScore) {
			System.out.println("BOTH LOSERS!");
		} else {

			System.out.println("YOU ARE LOSER! MUAHAHAHA!");
		}

	}

	public void aIVsAI(AI ai1, AI ai2) {

		for (int x = 0; x <= 2; x++) {

			int aIChoice1 = ai1.aIPlay();

			int aIChoice2 = ai2.aIPlay();

			if (aIChoice1 == aIChoice2) {

				System.out.println("AI's have drawn");

			} else if (aIChoice1 == 1 && aIChoice2 == 0) {

				System.out.println("1 picked paper and 2 picked rock");
				ai1.aIScore = ai1.aIScore + 1;

			} else if (aIChoice1 == 1 && aIChoice2 == 2) {

				ai2.aIScore = ai2.aIScore + 1;
				System.out.println("1 picked paper and 2 picked scissors");

			} else if (aIChoice1 == 0 && aIChoice2 == 1) {
				ai2.aIScore = ai2.aIScore + 1;
				System.out.println("1 picked rock and 2 picked paper");
			} else if (aIChoice1 == 0 && aIChoice2 == 2) {
				ai1.aIScore = ai1.aIScore + 1;
				System.out.println("1 picked rock and 2 picked scissors");
			} else if (aIChoice1 == 2 && aIChoice2 == 1) {
				ai1.aIScore = ai1.aIScore + 1;
				System.out.println("1 picked scissors and 2 picked paper");
			} else if (aIChoice1 == 2 && aIChoice2 == 0) {
				ai2.aIScore = ai2.aIScore + 1;
				System.out.println("1 picked scissors and 2 picked rock");
			}

			System.out.println("AI Score: " + ai1.aIScore);
			System.out.println("AI Score 2: " + ai2.aIScore);

		}

		if (ai1.aIScore > ai2.aIScore) {

			System.out.println("AI 1 WIN!");
		} else if (ai1.aIScore == ai2.aIScore) {
			System.out.println("BOTH LOSERS!");
		} else {

			System.out.println("AI 2 WIN!");
		}

	}

	public void multiAI(ArrayList<AI> aiList) {

		ArrayList<Integer> tempList = new ArrayList<Integer>();

		for (AI i : aiList) {

			int aIChoice = i.aIPlay();

			tempList.add(aIChoice);

		}

		Scanner userInput = new Scanner(System.in);

		int x = userInput.nextInt();
		
		tempList.add(x);

	}
}
