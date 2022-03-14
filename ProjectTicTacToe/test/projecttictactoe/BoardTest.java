/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttictactoe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ashwi
 */
public class BoardTest {
    
    public BoardTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getCurrentPlayerMark method, of class Board.
     */
    @Test
    public void testGetCurrentPlayerMark() {
        System.out.println("getCurrentPlayerMark");
        Board instance = new Board();
        char expResult = 'x';
        char result = instance.getCurrentPlayerMark();
        assertEquals(expResult, result);

    }

    /**
     * Test of initializeBoard method, of class Board.
     */
    @Test
    public void testInitializeBoard() {
        System.out.println("initializeBoard");
        Board instance = new Board();
        instance.initializeBoard();

    }

    /**
     * Test of printBoard method, of class Board.
     */
    @Test
    public void testPrintBoard() {
        System.out.println("printBoard");
        Board instance = new Board();
        instance.printBoard();

    }

    /**
     * Test of isBoardFull method, of class Board.
     */
    @Test
    public void testIsBoardFull() {
        System.out.println("isBoardFull");
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.isBoardFull();
        assertEquals(expResult, result);

    }

    /**
     * Test of checkForWin method, of class Board.
     */
    @Test
    public void testCheckForWin() {
        System.out.println("checkForWin");
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.checkForWin();
        assertEquals(expResult, result);

    }

    /**
     * Test of changePlayer method, of class Board.
     */
    @Test
    public void testChangePlayer() {
        System.out.println("changePlayer");
        Board instance = new Board();
        instance.changePlayer();

    }

    /**
     * Test of placeMark method, of class Board.
     */
    @Test
    public void testPlaceMark() {
        System.out.println("placeMark");
        int row = 0;
        int col = 0;
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.placeMark(row, col);
        assertEquals(expResult, result);

    }
    
}
