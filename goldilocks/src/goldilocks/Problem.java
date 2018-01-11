package goldilocks;

import java.util.ArrayList;

public class Problem {
	//getting input
	ArrayList<Seat> input;
	
	public Problem(ArrayList<Seat> input) {
		
		this.input = input;
	}
	

	public ArrayList<Integer> numSeats(){ 
		
		//good seats and return
		ArrayList<Integer> goodSeats = new ArrayList<Integer>();
		
		//Getting goldilocks and comparing to array
		Seat goldilocks = input.get(0); 
		for (int i=1; i<input.size();i++) {
			if (goldilocks.getWeight() <= input.get(i).getWeight() && goldilocks.getTemperature() >= input.get(i).getTemperature()) {
				goodSeats.add(i);
				
			}
		}
		return goodSeats;
	}
	
}
