package at.dbo.cc.spiele;

import at.dbo.cc.util.ScannerHelper;

public class VierGewinnt {

    static char empty = ' ';
    static char playerOne = 'o';
    static char playerTwo = '#';
    static char[][] field = new char[7][7];
    static boolean hasWon = false;

    public static void main(String[] args) {

        clearField(field);
        printField(field);

        char currentPlayer = playerOne;
        char winner = empty;


        while (!hasWon) {
            System.out.println("-----------------------------");
            System.out.print("Eingabe Spieler " + currentPlayer + ": ");
            int xCoordinate = ScannerHelper.scannerNumber();

            int yCoordinate = setPlayerValue(currentPlayer, xCoordinate);      // Stein setzen und y-Koordinate retour erhalten

            printField(field);
            System.out.println("");

            hasWinner(currentPlayer, yCoordinate, xCoordinate);
            hasWinnerDiagonal(currentPlayer, yCoordinate, xCoordinate);

            if (currentPlayer == playerOne) {
                currentPlayer = playerTwo;
            } else currentPlayer = playerOne;
        }

    }


    public static char[][] clearField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = empty;
            }
        }
        return field;
    }


    public static void printField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            System.out.print("| " + i + " ");
        }
        System.out.println("|");

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print("| " + field[i][j] + " ");
            }
            System.out.println("|");
        }
    }


    public static int setPlayerValue(char currentPlayer, int xCoordinate) {
        for (int i = field.length - 1; i >= 0; i--) {
            if (field[i][xCoordinate] == empty) {
                field[i][xCoordinate] = currentPlayer;
                return i;                                                       // returniert mir die Y-Koordinate

            } else {
                continue;
            }
        }
        return -1;
    }


    public static boolean hasWinner(char currentPlayer, int yCoordinate, int xCoordinate) {

        // HORIZONTALE Gewinnabfrage
        int moveX = xCoordinate;
        int counter = 1;

        // Abfrage nach links
        while (moveX > 0 && field[yCoordinate][moveX - 1] == currentPlayer) {
            counter++;
            if (counter == 4) {
                return hasWon = true;
            }
            moveX--;
        }

        // TODO improve the code: if (moveX != xCoordinate){ ...........................................................
        moveX = xCoordinate;                              // Wert wieder auf Ausgangswert setzen und Abfrage nach rechts
        while (moveX + 1 != field.length && field[yCoordinate][moveX + 1] == currentPlayer) {
            counter++;
            if (counter == 4) {
                return hasWon = true;
            }
            moveX++;
        }

        // VERTIKALE Gewinnabfrage
        int moveY = yCoordinate;
        counter = 1;                                        // Counter wieder auf 1 setzen, damit er die zuvor gezählten Punkte der X-Koordinate nicht übernimmt

        while (moveY < 6 && field[moveY + 1][xCoordinate] == currentPlayer) {
            counter++;
            if (counter == 4) {
                return hasWon = true;
            }
            moveY++;
        }

        return true;
    }

    public static boolean hasWinnerDiagonal(char currentPlayer, int yCoordinate, int xCoordinate) {

        // ******************** ABFRAGE DIAGONALE 1
        int counter = 0;
        int moveX = xCoordinate;
        int moveY = yCoordinate;

        // Abfrage nach links-unten
        while (moveX >= 0 && moveY != field.length && field[moveY][moveX] == currentPlayer) {
            counter++;
            if (counter == 4) {
                return hasWon = true;
            }
            moveX -= 1;
            moveY += 1;
        }

        // Abfrage nach rechts-oben
        if (xCoordinate + 1 != field.length && field[yCoordinate - 1][xCoordinate + 1] == currentPlayer) {
            moveX = xCoordinate;
            moveY = yCoordinate;
            while (field[moveY - 1][moveX + 1] == currentPlayer) {
                counter++;
                if (counter == 4) {
                    return hasWon = true;
                }
                moveX += 1;
                moveY -= 1;
            }
        }


        // ******************** ABFRAGE DIAGONALE 2
        counter = 0;
        moveX = xCoordinate;
        moveY = yCoordinate;

        // Abfrage nach rechts-unten
        while (moveY < 6 && moveX != field.length && field[moveY][moveX] == currentPlayer) {
            counter++;
            if (counter == 4) {
                return hasWon = true;
            }
            moveX += 1;
            moveY += 1;
        }

        // Abfrage nach links-oben
        if (yCoordinate + 1 != field.length && xCoordinate - 1 >= 0 && field[yCoordinate - 1][xCoordinate - 1] == currentPlayer) {
            moveX = xCoordinate;
            moveY = yCoordinate;
            while (field[moveY - 1][moveX - 1] == currentPlayer) {
                counter++;
                if (counter == 4) {
                    return hasWon = true;
                }
                moveX -= 1;
                moveY -= 1;
            }
        }







        return true;
    }

}



