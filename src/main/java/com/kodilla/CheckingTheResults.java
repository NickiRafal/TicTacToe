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
    public static boolean checkGameResult(char[][] board, User[] players, char currentPlayerFigure) {
        if (CheckingTheResults.checkForXWinRow(board, currentPlayerFigure)) {
            System.out.println("Gracz " + getCurrentPlayerUsername(players, currentPlayerFigure) + " wygrał!");
            return false;
        }
        if (CheckingTheResults.checkForXWinColumn(board, currentPlayerFigure)) {
            System.out.println("Gracz " + getCurrentPlayerUsername(players, currentPlayerFigure) + " wygrał!");
            return false;
        }
        if (CheckingTheResults.checkForXWinDiagonal(board, currentPlayerFigure)) {
            System.out.println("Gracz " + getCurrentPlayerUsername(players, currentPlayerFigure) + " wygrał!");
            return false;
        }

        if (CheckingTheResults.checkForOWinRow(board, currentPlayerFigure)) {
            System.out.println("Gracz " + getCurrentPlayerUsername(players, currentPlayerFigure) + " wygrał!");
            return false;
        }
        if (CheckingTheResults.checkForOWinColumn(board, currentPlayerFigure)) {
            System.out.println("Gracz " + getCurrentPlayerUsername(players, currentPlayerFigure) + " wygrał!");
            return false;
        }
        if (CheckingTheResults.checkForOWinDiagonal(board, currentPlayerFigure)) {
            System.out.println("Gracz " + getCurrentPlayerUsername(players, currentPlayerFigure) + " wygrał!");
            return false;
        }

        if (CheckingTheResults.checkForDraw(board)) {
            System.out.println("Gra zakończona remisem!");
            return false;
        }
        return false;
    }

    public static String getCurrentPlayerUsername(User[] players, char currentPlayerFigure) {
        for (User player : players) {
            if (player.getFigure() == currentPlayerFigure) {
                return player.getUsername();
            }
        }
        return "";
    }

    // Metoda sprawdzająca wynik gry
    public static boolean checkGameResult(char[][] board, User[] players, int currentPlayerIndex) {
        char currentPlayerFigure = players[currentPlayerIndex].getFigure();

        if (CheckingTheResults.checkForXWinRow(board, currentPlayerFigure)
                || CheckingTheResults.checkForXWinColumn(board, currentPlayerFigure)
                || CheckingTheResults.checkForXWinDiagonal(board, currentPlayerFigure)
                || CheckingTheResults.checkForOWinRow(board, currentPlayerFigure)
                || CheckingTheResults.checkForOWinColumn(board, currentPlayerFigure)
                || CheckingTheResults.checkForOWinDiagonal(board, currentPlayerFigure)
                || CheckingTheResults.checkForDraw(board)) {
            System.out.println("Gracz " + players[currentPlayerIndex].getUsername() + " wygrał!");
            return true; // Gra się zakończyła
        }
        return false; // Gra trwa
    }





}