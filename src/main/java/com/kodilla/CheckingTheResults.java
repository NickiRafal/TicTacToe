package com.kodilla;

public class CheckingTheResults {
    public static boolean checkForOWinRow(char[][] board, char figure) {
        int boardSize = board.length;

        // Sprawdzenie zwycięstwa w wierszach
        for (int row = 0; row < boardSize; row++) {
            boolean win = true;
            for (int column = 0; column < boardSize; column++) {
                if (board[row][column] != figure) {
                    win = false;
                    break;
                }
            }
            if (win) {
                System.out.println("Wygrana " + figure);
                return true;
            }
        }
        return false;
    }

    public static boolean checkForOWinColumn(char[][] board, char figure) {
        int boardSize = board.length;
        // Sprawdzenie zwycięstwa w kolumnach
        for (int column = 0; column < boardSize; column++) {
            boolean win = true;
            for (int row = 0; row < boardSize; row++) {
                if (board[row][column] != figure) {
                    win = false;
                    break;
                }
            }
            if (win) {
                System.out.println("Wygrana " + figure);
                return true;
            }
        }
        return false;
    }

    public static boolean checkForOWinDiagonal(char[][] board, char figure) {
        int boardSize = board.length;
        // Sprawdzenie zwycięstwa na przekątnych
        boolean mainDiagonalWin = true;
        boolean secondaryDiagonalWin = true;
        for (int i = 0; i < boardSize; i++) {
            if (board[i][i] != figure) {
                mainDiagonalWin = false;
            }
            if (board[i][boardSize - 1 - i] != figure) {
                secondaryDiagonalWin = false;
            }
        }
        if (mainDiagonalWin || secondaryDiagonalWin) {
            System.out.println("Wygrana " + figure);
            return true;
        }

        return false;
    }


    public static boolean checkForXWinRow(char[][] board, char figure) {
        int boardSize = board.length;

        // Sprawdzenie zwycięstwa w wierszach
        for (int row = 0; row < boardSize; row++) {
            boolean win = true;
            for (int column = 0; column < boardSize; column++) {
                if (board[row][column] != figure) {
                    win = false;
                    break;
                }
            }
            if (win) {
                System.out.println("Wygrana " + figure);
                return true;
            }
        }
        return false;
    }

    public static boolean checkForXWinColumn(char[][] board, char figure) {
        int boardSize = board.length;
        // Sprawdzenie zwycięstwa w kolumnach
        for (int column = 0; column < boardSize; column++) {
            boolean win = true;
            for (int row = 0; row < boardSize; row++) {
                if (board[row][column] != figure) {
                    win = false;
                    break;
                }
            }
            if (win) {
                System.out.println("Wygrana " + figure);
                return true;
            }
        }
        return false;
    }

    public static boolean checkForXWinDiagonal(char[][] board, char figure) {
        int boardSize = board.length;
        // Sprawdzenie zwycięstwa na przekątnych
        boolean mainDiagonalWin = true;
        boolean secondaryDiagonalWin = true;
        for (int i = 0; i < boardSize; i++) {
            if (board[i][i] != figure) {
                mainDiagonalWin = false;
            }
            if (board[i][boardSize - 1 - i] != figure) {
                secondaryDiagonalWin = false;
            }
        }
        if (mainDiagonalWin || secondaryDiagonalWin) {
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
                    System.out.println("Remis");
                    return false;
                }
            }
        }
        // Jeżeli przejdziemy przez wszystkie pola i nie znaleźliśmy pustego pola, to jest remis
        return true;
    }

}