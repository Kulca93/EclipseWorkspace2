
public class RockAI extends AI {

	int aIScore;

	public int aIPlay() {

		int p;

		p = (int) (Double.parseDouble(String.valueOf(Math.floor(Math.random() * 10))));

		if (p <= 6) {

			System.out.println("rock");
			return 0;

		}
		if (p <= 8) {

			System.out.println("paper");
			return 1;

		}

		System.out.println("scissors");

		return 2;

	}

}
