package com.kodilla;
public class CheckingTheResults {

    public static boolean checkForWinRow(char[][] board, char figure) {
        int boardSize = board.length;
        int targetCounter;
        if (boardSize == 10) {
            targetCounter = 5;  // Ilość figur w rzędzie dla zwycięstwa
        }else {
            targetCounter = 3;
        }
        // Sprawdzenie zwycięstwa w wierszach
        for (int row = 0; boardSize > row; row++) {
            int counter = 0;

            for (int column = 0; column < boardSize; column++) {
                if (board[row][column] == figure) {
                    counter++;
                    if (counter == targetCounter) {
                        System.out.println("Wygrana " + figure);
                        return true;
                    }
                } else {
                    counter = 0;
                }
            }
        }

        return false;
    }
    public static boolean checkForWinColumn(char[][] board, char figure) {
        int boardSize = board.length;
        int targetCounter;
        if (boardSize == 10){
            targetCounter = 5;
        }else {
            targetCounter =3;
        }
        // Sprawdzenie zwycięstwa w kolumnach
        for (int column = 0; column < boardSize; column++) {
            int counter = 0;
            for (int row = 0; row < boardSize; row++) {
                if (board[row][column] == figure) {
                    counter++;
                    if (counter == targetCounter) {
                        System.out.println("Wygrana " + figure);
                        return true;
                    }
                } else {
                    counter = 0;
                }
            }
        }
        return false;
    }

    public static boolean checkForWinDiagonal(char[][] board, char figure) {
        int boardSize = board.length;
        int targetCounter;
        if (boardSize == 10) {
            targetCounter = 5;
        }else {
            targetCounter =3;
        }
        // Sprawdzenie zwycięstwa na przekątnych
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < boardSize; i++) {
            if (board[i][i] == figure) {
                counter1++;
            }
            if (board[i][boardSize - 1 - i] == figure) {
                counter2++;
            }
        }
        if (counter1 == targetCounter||counter2 == targetCounter) {
            System.out.println("Wygrana " + figure);
            return true;
        }

        return false;
    }
    public static boolean checkForDraw(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                // Jeżeli znajdziemy puste pole, to gra nie zakończyła się remisem
                if (board[row][col] == '\u0000') {
                    return false;
                }
            }
        }
        // Jeżeli przejdziemy przez wszystkie pola i nie znaleźliśmy pustego pola, to jest remis
        return true;
    }


    public static boolean checkGameResultPlayer(char[][] board, User player) {
        char currentPlayerFigure = player.getFigure();

        if (CheckingTheResults.checkForWinRow(board, currentPlayerFigure)
                || CheckingTheResults.checkForWinColumn(board, currentPlayerFigure)
                || CheckingTheResults.checkForWinDiagonal(board, currentPlayerFigure)) {
            System.out.println("Gracz " + player.getUsername() + " wygrał!");
            return true; // Gra się zakończyła
        }else if(CheckingTheResults.checkForDraw(board)){
            System.out.println("Nastąpił remis");
            return true;
        }
        return false; // Gra trwa
    }
    public static boolean checkGameResultComputer(char[][] board, Computer computer) {
        char currentPlayerFigure = computer.getFigure();

        if (CheckingTheResults.checkForWinRow(board, currentPlayerFigure)
                || CheckingTheResults.checkForWinColumn(board, currentPlayerFigure)
                || CheckingTheResults.checkForWinDiagonal(board, currentPlayerFigure)) {
            System.out.println("Komputer  wygrał!");
            return true; // Gra się zakończyła
        }else if(CheckingTheResults.checkForDraw(board)){
            System.out.println("Nastąpił remis");
            return true;
        }
        return false; // Gra trwa
    }
}