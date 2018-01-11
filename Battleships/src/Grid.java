import java.util.ArrayList;

public class Grid {

	public char[][] gridBoard = new char[3][3];
	public static final String alphabet = "abcdefg";
	private int gridLength = 3;
	private int gridSize = 9;
	private int[] grid = new int[gridSize];
	private int shipCount = 0;

	// Initialises Grid
	public void initialiseGrid() {

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++)

				gridBoard[x][y] = 'o';

		}
	}
	
	ArrayList<String> placeShip(int shipSize) {
		ArrayList<String> alphaCells = new ArrayList<String>();
		String[] alphaCoords = new String[shipSize];
		String temp = null;
		int[] coords = new int[shipSize];
		int attempts = 0;
		boolean success = false;
		int location = 0;
		
		shipCount++;
		int incr = 1;
		if((shipCount & 2) == 1){
			incr = gridLength;
		}
		
		while(!success && attempts++ < 2) {
			location = (int) (Math.random() * gridSize);
			int x = 0;
			success = true;
			while(success && x < shipSize) {
				if(grid[location] == 0) {
					coords[x++] = location;
					location += incr;
					if(location >= gridSize) {
						success = false;
					}
					if(x>0 && (location % gridLength == 0)) {
						success = false;
					} else {
						success = false;
					}
				}
			}
			int x1 = 0;
			int row = 0;
			int column = 0;
			while (x1 < shipSize) {
				grid[coords[x1]] = 1;
				row = (int)(coords[x1]/gridLength);
				column = coords[x1] % gridLength;
				temp = String.valueOf(alphabet.charAt(column));
				alphaCells.add(temp.concat(Integer.toString(row)));
				x1++;
			}
			

		}
		return alphaCells;
	}
	
	
//	public char[][] placeShip() {
//		
//		
//		
//		gridBoard[1][1] = 'S';
//		gridBoard[1][2] = 'S';
//		
//		return gridBoard;
//	}

	// Print Grid
	public void drawGrid() {
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++)
				System.out.print("|" + gridBoard[x][y] + "|");
			System.out.println("");

		}
	}
}
