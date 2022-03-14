
package projecttictactoe;

import java.util.Scanner;

public class ProjectTicTacToe {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Board game = new Board();
        game.initializeBoard();
        System.out.println("Tic-Tac-Toe!");
        do
        {
            game.printBoard();
            int row;
            int col;
            do
            {
                System.out.println(game.getCurrentPlayerMark() + " Choose a Column and a Row");
                row = scan.nextInt()-1;
                col = scan.nextInt()-1;
            }
            while (!game.placeMark(row, col));
            game.changePlayer();
        }
        while(!game.checkForWin() && !game.isBoardFull());
        if (game.isBoardFull() && !game.checkForWin())
        {
            System.out.println("Yall really tied huh?");
        }
        else
        {
            game.printBoard();
            game.changePlayer();
            System.out.println(Character.toUpperCase(game.getCurrentPlayerMark()) + "Amazing Win, You Move On To The Next Game!");
        }
    }
}
