package goldilocks;

public class Seat {

	private int weight  ;
	private int temperature;
	
	//constructor
	public Seat(int weight, int temperature) {
		super();
		this.weight = weight;
		this.temperature = temperature;
	}
	//getters and setters
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
}
