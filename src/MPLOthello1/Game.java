
package OthelloProject;
import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Game {

    //Public Constants for game.
    public final static int ME = 1;
    public final static int OPPONENT = -1;
    public final static int BORDER = -2;
    public final static int EMPTY = 0;

    //Instance Variables 
    static int gameBoard[] = new int [100];    // -> Board;
    static int boards[] = new int [100];
    static int currentPlayer;  // -> int (1,-1);
    static int notPlayer;
    static char myColor;        // Black or White;
    static char opColor;
    static char currentColor;

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        char initilize = input.next().charAt(0);
        myColor = input.next().charAt(0);
        
        
 //Initialize Board 
        int score=0;

        if (myColor == 'B') {
            opColor = 'W';
            currentPlayer = ME;
        } 
        else {
            opColor ='B';
            currentPlayer = OPPONENT;
        }
        Board.boardSetUp();
        boards = gameBoard;
        PrintBoard.PrintField(args);
        
        System.out.println("R "+ myColor);
        
        int player =2;
        while (LegalMoves.gameOver(gameBoard)!=true ){
            if (currentPlayer ==OPPONENT) player =1;
            if (player %2 ==1){
                currentPlayer = OPPONENT;
                currentColor = opColor;
                notPlayer=ME;
                char color = input.next().charAt(0);
                char col = input.next().charAt(0);
                int row = input.nextInt();
                
                LegalMoves.takeMoves(color, col, row);
                //LegalMoves.findTheMoves();
                PrintBoard.PrintField(args);
                player++;
                
            } 
            if (player %2 ==0) {
                
                notPlayer=OPPONENT;
                currentPlayer= ME;
                currentColor = myColor;
                //LegalMoves.findMoves();
                
                LegalMoves.findTheMoves();
                
                
                
                PrintBoard.PrintField(args); 
                player++;
            }
            
            
            //Print N for end game
        //System.out.println("n");
        
    }//End of WhileLoop
        for (int i =11; i<64; i++){
            score +=Board.getBoard(i, gameBoard);
        }
        score*=1000; 
        if(score>0) System.out.println(myColor + " Wins " + score/1000 + " to " + (64 -(score/1000)));
        else if(score<0) System.out.println(myColor+ " Loses "+ (-1*(score/1000)) + " to " + (-1*(64 -(score/1000))));
        else if (score==0) System.out.println("TIE");
        
        
        
    }//End of main

}//End of Game
