package at.dbo.cc.spiele;

import at.dbo.cc.util.ScannerHelper;

public class TicTacToe {

    static char playerOne = 'x';
    static char playerTwo = 'o';
    static char empty = '-';
    static char[][] field = new char[3][3];

    public static void main(String[] args) {

        System.out.println("####################################################");
        System.out.println("Hallo, Willkommen zu Tic Tac Toe! \nDie Eingabe erfolgt nach dem x-y-Koordinatenprinzip!");
        System.out.println("####################################################");

        clearFieldValues(field);
        char currentPlayer = playerOne;
        char winner = empty;

        while(winner == empty){

            printField(field);
            System.out.print("Eingabe Spieler " + currentPlayer + ": ");

            String userInput = ScannerHelper.scannerText();
            String[] values = userInput.split(",");
            int xCoordinate = Integer.parseInt(values[0]);
            int yCoordinate = Integer.parseInt(values[1]);

            if(CheckIfPossibleToSetValue(currentPlayer, xCoordinate, yCoordinate)){
                if(currentPlayer == playerOne){
                    currentPlayer = playerTwo;
                } else currentPlayer = playerOne;
            }

            System.out.println("");
            winner = getWinner();
        }

        System.out.println("Der Gewinner ist " + winner);
        printField(field);

    }


    public static char[][] clearFieldValues(char[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                field[row][col] = empty;
            }
        }
        return field;
    }


    public static void printField(char[][] field) {
        //System.out.println("-----------------");
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                System.out.print("|" + field[row][col]);
            }
            System.out.println("|");
        }
    }


   public static boolean CheckIfPossibleToSetValue(char currentPlayer, int yCoordinate, int xCoordinate) {
        if (field[xCoordinate][yCoordinate] == empty) {
            field[xCoordinate][yCoordinate] = currentPlayer;
            return true;
        } else{
            System.out.println("*** Feld schon besetzt, bitte anderes Feld auswählen ***");
            return false;
        }
    }


    public static char getWinner() {
        // horizontale Abfrage ob es einen Gewinner gibt
        for (int col = 0; col < field.length; col++) {
            if(field[col][0] != empty && field[col][0] == field[col][1] && field[col][1] == field[col][2]){
                return field[col][0];
            }
        }
        // vertikale Abfrage ob es einen Gewinner gibt
        for (int row = 0; row < field.length; row++) {
            if(field[0][row] != empty && field[0][row] == field[1][row] && field[1][row] == field[2][row]){
                return field[0][row];
            }
        }
        // diagonale Abfrage von links oben nach rechts unten
        if(field[0][0] != empty && field[0][0] == field[1][1] && field[1][1] == field[2][2]){
            return field[0][0];
        }
        // diagonale Abfrage von rechts oben nach links unten
        if(field[2][0] != empty && field[2][0] == field[1][1] && field[1][1] == field[0][2]){
            return field[0][0];
        }
        return empty;
    }




}
