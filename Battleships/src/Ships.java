
public abstract class Ships {

	// Values each ship must return
	private int shipSize;
	private String name;
	private char shipCharacter;
	private int healthPoints;

	// Ship getters and setters
	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public char getShipCharacter() {
		return shipCharacter;
	}

	public void setShipCharacter(char shipCharacter) {
		this.shipCharacter = shipCharacter;
	}

	public int getLength() {
		return shipSize;
	}

	public void setLength(int shipSize) {
		this.shipSize = shipSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Abstract classes
	public abstract int shipSize();

	public abstract String name();

	public abstract char shipCharacter();

	public abstract int healthPoints();

}
