import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[][] board = new String[3][3];

		createBoard(board);
	//	printBoard(board);
		createShip(board,3);
		printBoard(board);

	}

	// Grid class
	public static void createBoard(String[][] board) {

		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[0].length; c++) {
				board[r][c] = "o";
			}
		}
	}

	public static void printBoard(String[][] board) {

		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[0].length; c++) {
				System.out.print('|' + board[r][c] + '|');
			}
			System.out.println();
		}

	}

	// ships
	public static void createShip(String[][] board, int size) {
		if (Math.random() < 0.5) {
			// horizontal
			int col = (int) (Math.random() * 1);
			int row = (int) (Math.random() * board[0].length);
			for (int i = 0; i < size; i++) {
				board[row][col + i] = "h";
			}

		} else {
			// vertical
			int row = (int) (Math.random() * 1);
			int col = (int) (Math.random() * board[0].length);
			for (int i = 0; i < size; i++) {
				board[row + i][col] = "v";
		}
	}

}
}
