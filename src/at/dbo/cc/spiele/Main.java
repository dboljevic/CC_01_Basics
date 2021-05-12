package at.dbo.cc.spiele;

import java.util.Scanner;

public class Main {

	static char x = 'X';
	static char o = 'O';
	static char empty = '_';
	static char[][] board = createBoard();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char winner = empty;
		char currentPlayer = x;

		while (winner == empty) {
			System.out.println(currentPlayer + " ist an der Reihe");
			printBoard();

			String nextLine = scanner.nextLine();
			int xKoord = getXKoord(nextLine);
			int yKoord = getYKoord(nextLine);

			if (trySetValue(currentPlayer, xKoord, yKoord)) {
				if (currentPlayer == x) {
					currentPlayer = o;
				} else {
					currentPlayer = x;
				}
				winner = getWinner();
			}
		}
		printBoard();

		System.out.println("Der Gewinner ist " + winner);
		scanner.close();
	}

	/**
	 * Hole x-koordinate aus einer Eingabe
	 * 
	 * @param coordinates
	 * @return
	 */
	public static int getXKoord(String coordinates) {
		return Integer.parseInt(coordinates.split(",")[0].trim());
	}

	/**
	 * Hole y-koordinate aus einer Eingabe
	 * 
	 * @param coordinates
	 * @return
	 */
	public static int getYKoord(String coordinates) {
		return Integer.parseInt(coordinates.split(",")[1].trim());
	}

	/**
	 * 3x3 Board erstellen
	 * 
	 * @return
	 */
	public static char[][] createBoard() {
		char[][] board = new char[3][3];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = empty;
			}
		}
		return board;
	}

	/**
	 * Board in der Konsole ausgeben
	 */
	public static void printBoard() {
		System.out.println("#################################################################");
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * Setze einen Wert im Board. Es koennen nur Werte gesetzt werden die nicht
	 * schon gesetzt sind und "values" die den variablen x und o entsprechen.
	 * 
	 * @param value
	 * @param xKoord
	 * @param yKoord
	 * @return Wenn das Setzen erfolgreich war TRUE sonst FALSE.
	 */
	public static boolean trySetValue(char value, int xKoord, int yKoord) {
		if ((value == x || value == o) && board[yKoord][xKoord] == empty) {
			board[yKoord][xKoord] = value;
			return true;
		}
		return false;
	}

	/**
	 * @return Ermittelt den Tictactoe gewinner.
	 */
	public static char getWinner() {
		for (int i = 0; i < board.length; i++) {
			if (board[i][0] != empty && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				return board[i][0];
			}
		}
		for (int i = 0; i < board.length; i++) {
			if (board[0][i] != empty && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
				return board[0][i];
			}
		}

		if (board[0][0] != empty && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
			return board[0][0];
		}

		if (board[2][0] != empty && board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
			return board[0][0];
		}

		return empty;
	}
}
