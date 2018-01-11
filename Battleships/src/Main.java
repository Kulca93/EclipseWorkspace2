
public class Main {

	public static void main(String[] args) {

		Grid grid = new Grid();
//		Grid gridTwo = new Grid();
//		Ships ship = new Battleship();

		grid.initialiseGrid();
//		grid.gridBoard = ship.shipPosition(grid.gridBoard);
		grid.placeShip(0);
		grid.drawGrid();


//		gridTwo.initialiseGrid();
		// gridTwo.gridBoard = ship.shipPosition(gridTwo.gridBoard);
//		gridTwo.drawGrid();

	}

}
