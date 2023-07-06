package com.kodilla;
import com.kodilla.InputFromTheKeyboard;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayGameTest {


    @Test       //Test dla wygranej w wierszach dla figury O
    public void testOWinningRows() {
        char[][] board = {{'O', 'O', 'O'}, {'X', ' ', 'X'}, {' ', ' ', 'X'}};
        char figure = 'O';
        assertTrue(CheckingTheResults.checkForOWinRow(board, figure));
    }
    @Test       // Test dla wygranej w kolumnach dla figury O
    public void testOWinningColumns() {
        char[][] board = {{'O', 'X', 'O'}, {'O', ' ', 'X'}, {'X', ' ', 'X'}};
        char figure = 'O';
        assertFalse(CheckingTheResults.checkForOWinColumn(board,figure));
    }

    @Test       //Test dla wygranej po przekątnej dla figury O
    public void testOWinningDiagonals() {
        char[][] board = {{'O', ' ', 'O'}, {'X', 'O', 'X'}, {'O', ' ', 'X'}};
        char figure = 'O';
        assertTrue(CheckingTheResults.checkForOWinDiagonal(board,figure));
    }

    @Test       //Test dla wygranej w wierszach dla figury X
    public void testXWinningRows() {
        char[][] board = {{'X', 'X', 'X'}, {'O', ' ', 'O'}, {' ', 'X', 'X'}};
        char fiure = 'X';
        assertTrue(CheckingTheResults.checkForXWinRow(board,fiure));
    }

    @Test       // Test dla wygranej w kolumnach dla figury X
    public void testXWinningColumns() {
        char[][] board = {{'O', 'X', 'O'}, {' ', 'X', 'X'}, {' ', 'X', 'X'}};
        char fiure = 'X';
        assertFalse(CheckingTheResults.checkForXWinColumn(board,fiure));
    }

    @Test       //Test dla wygranej po przekątnej dla figury X
    public void testXWinningDiagonals() {
        char[][] board = {{'X', 'O', 'O'}, {' ', 'X', 'O'}, {'X', ' ', 'X'}};
        char figure = 'X';
        assertTrue(CheckingTheResults.checkForXWinDiagonal(board,figure));
    }


    @Test       //Test dla remisu
    public void testCheckForDraw() {
        // Przygotowanie planszy prowadzącej do remisu
        char[][] board = {
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'O', 'X', 'O'}
        };

        // Sprawdzenie, czy plansza prowadzi do remisu
        assertTrue(CheckingTheResults.checkForDraw(board));
    }

}

