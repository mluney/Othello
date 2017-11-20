/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OthelloProject;

import static OthelloProject.Game.boards;
import static OthelloProject.Game.gameBoard;
import static OthelloProject.Game.myColor;
import java.util.ArrayList;


//import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Board  {
    Board getMyColor; 
    
    public static void boardSetUp () {
    
        int x =11;
    for (int i =0; i<10; i++){
        gameBoard[i] = -2;
        gameBoard[i+90] = -2;
        gameBoard[i*10] = -2;
        gameBoard[i*10+9]=-2;
    }
    
        

    
    if (myColor == 'B') {
        gameBoard[45] = 1;
        gameBoard[54] =1;
        gameBoard[55] =-1;
        gameBoard[44] =-1;
    }
    else { 
        gameBoard [55] = 1;
        gameBoard[44] = 1;
        gameBoard[54] =-1;
        gameBoard[45] =-1;
            }
    }//End of BoardSetUp
    
    public static int getBoard (int i, int [] newBoard) {
        
        
        
        return newBoard[i];
    }
    public static void newBoards (int [] moves){
      ArrayList<int[]>list = new ArrayList<>();  
      
      
      for(int i=0; i< moves.length; i++){
          boards = gameBoard;
          LegalMoves.flipBits(moves[i]);
         list.add(i,(boards)); 
      }
      
      
        
    }
    
    
   /*    
   int[] move() {
      int[] result = minimax(2, mySeed, Integer.MIN_VALUE, Integer.MAX_VALUE);
         // depth, max-turn, alpha, beta
      return new int[] {result[1], result[2]};   // row, col
   }
    */
 
   /** Minimax (recursive) at level of depth for maximizing or minimizing player
       with alpha-beta cut-off. Return int[3] of {score, row, col}  */
    /*
   private int[] minimax(int depth, Seed player, int alpha, int beta) {
      // Generate possible next moves in a list of int[2] of {row, col}.
      List<int[]> nextMoves = generateMoves();
 
      // mySeed is maximizing; while oppSeed is minimizing
      int score;
      int bestRow = -1;
      int bestCol = -1;
 
      if (nextMoves.isEmpty() || depth == 0) {
         // Gameover or depth reached, evaluate score
         score = evaluate();
         return new int[] {score, bestRow, bestCol};
      } else {
         for (int[] move : nextMoves) {
            // try this move for the current "player"
            cells[move[0]][move[1]].content = player;
            if (player == mySeed) {  // mySeed (computer) is maximizing player
               score = minimax(depth - 1, oppSeed, alpha, beta)[0];
               if (score > alpha) {
                  alpha = score;
                  bestRow = move[0];
                  bestCol = move[1];
               }
            } else {  // oppSeed is minimizing player
               score = minimax(depth - 1, mySeed, alpha, beta)[0];
               if (score < beta) {
                  beta = score;
                  bestRow = move[0];
                  bestCol = move[1];
               }
            }
            // undo move
            cells[move[0]][move[1]].content = Seed.EMPTY;
            // cut-off
            if (alpha >= beta) break;
         }
         return new int[] {(player == mySeed) ? alpha : beta, bestRow, bestCol};
      }
   }
     */
}//End Of Board
        
