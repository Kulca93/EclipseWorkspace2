package goldilocks;

//can use array lists
import java.util.ArrayList;;

public class Main {

	public static void main(String[] args) {
		ArrayList<Seat> input = new ArrayList<>();
		
		//inputs		
		input.add(new Seat(100, 120));
		input.add(new Seat(297, 90));
		input.add(new Seat(66, 110));
		input.add(new Seat(257, 113));
		input.add(new Seat(276, 191));
		input.add(new Seat(280, 129));
		input.add(new Seat(219, 163));
		input.add(new Seat(254, 193));
		input.add(new Seat(86, 153));
		input.add(new Seat(206, 147));
		input.add(new Seat(71, 137));
		input.add(new Seat(104, 40));
		input.add(new Seat(238, 127));
		input.add(new Seat(52, 146));
		input.add(new Seat(129, 197));
		input.add(new Seat(144, 59));
		input.add(new Seat(157, 124));
		input.add(new Seat(210, 59));
		input.add(new Seat(11, 54));
		input.add(new Seat(268, 119));
		input.add(new Seat(261, 121));
		input.add(new Seat(12, 189));
		input.add(new Seat(186, 108));
		input.add(new Seat(174, 21));
		input.add(new Seat(77, 18));
		input.add(new Seat(54, 90));
		input.add(new Seat(174, 52));
		input.add(new Seat(16, 129));
		input.add(new Seat(59, 181));
		input.add(new Seat(290, 123));
		input.add(new Seat(248, 132));
		
		//Problem line 9
		Problem obj = new Problem(input);
		//Problem line 14
		System.out.println(obj.numSeats());

	}

}
