import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<AI> aiList = new ArrayList<AI>();

		AI ai = new AI();

		AI ai1 = new AI();
		AI ai2 = new AI();
		AI ai3 = new AI();
		AI ai4 = new AI();
		AI ai5 = new AI();
		
		aiList.add(ai1);
		aiList.add(ai2);
		aiList.add(ai3);
		aiList.add(ai4);
		aiList.add(ai5);

		Logic log = new Logic();

		RockAI rockai = new RockAI();
		PaperAI paperai = new PaperAI();
		ScissorsAi scissorsai = new ScissorsAi();

		// log.aIVsAI(ai1, ai2);
		// log.play(rockai);
		// log.play(paperai);
		// log.play(scissorsai);

		// log.play(ai);

	}

}
