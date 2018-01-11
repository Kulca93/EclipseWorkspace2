
public class Battleship extends Ships {
	
	//Values for ship
	
	private int shipSize = 3;
	private String name = "Patrol Boat";
	private char shipCharacter = 'B';
	private int healthPoints = 3;

	//Constructors for ships
	public int shipSize() {

		return shipSize;
	}

	public String name() {

		return name;
	}

	public char shipCharacter() {
		return shipCharacter;
	}

	public int healthPoints() {

		return healthPoints;
	}

}
