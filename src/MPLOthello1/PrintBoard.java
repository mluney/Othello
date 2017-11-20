
package OthelloProject;

import static OthelloProject.Game.gameBoard;
import static OthelloProject.Game.myColor;
import static OthelloProject.Game.opColor;

/**
 *
 * @author mluney
 */
public class PrintBoard {
 
    /**
     *
     * @param args
     */
    public static void PrintField (String[] args){ 
    int i;
    int j;
    
    System.out.println("C      A B C D E F G H ");
    System.out.println("C    * * * * * * * * * * ");
    System.out.print("C   *"); 
        for(i=0; i<=9; i++) {
             if (gameBoard[i] == 1) System.out.print(myColor+ " ");
             if (gameBoard[i] == -1) System.out.print(opColor+" ");
             if (gameBoard[i] == 0) System.out.print("- ");
             if (gameBoard[i] == -2) System.out.print("| ");
             
            
        }
    System.out.println("*");
    
    System.out.print("C 1 *"); 
        for(i=10; i<=19; i++) {
            if (gameBoard[i] == 1) System.out.print(myColor+ " ");
             if (gameBoard[i] == -1) System.out.print(opColor+" ");
             if (gameBoard[i] == 0) System.out.print("- ");
             if (gameBoard[i] == -2) System.out.print("| ");
            
        }
    System.out.println("*");
    
    System.out.print("C 2 *"); 
        for(i=20; i<=29; i++) {
            if (gameBoard[i] == 1) System.out.print(myColor+ " ");
             if (gameBoard[i] == -1) System.out.print(opColor+" ");
             if (gameBoard[i] == 0) System.out.print("- ");
             if (gameBoard[i] == -2) System.out.print("| ");
            
        }
    System.out.println("*");
    
    System.out.print("C 3 *"); 
        for(i=30; i<=39; i++) {
            if (gameBoard[i] == 1) System.out.print(myColor+ " ");
             if (gameBoard[i] == -1) System.out.print(opColor+" ");
             if (gameBoard[i] == 0) System.out.print("- ");
             if (gameBoard[i] == -2) System.out.print("| ");
            
        }
    System.out.println("*");
      
    System.out.print("C 4 *"); 
        for(i=40; i<=49; i++) {
            if (gameBoard[i] == 1) System.out.print(myColor+ " ");
             if (gameBoard[i] == -1) System.out.print(opColor+" ");
             if (gameBoard[i] == 0) System.out.print("- ");
             if (gameBoard[i] == -2) System.out.print("| ");
            
        }
    System.out.println("*");
    
    System.out.print("C 5 *"); 
        for(i=50; i<=59; i++) {
            if (gameBoard[i] == 1) System.out.print(myColor+ " ");
             if (gameBoard[i] == -1) System.out.print(opColor+" ");
             if (gameBoard[i] == 0) System.out.print("- ");
             if (gameBoard[i] == -2) System.out.print("| ");
            
        }
    System.out.println("*");
    
    System.out.print("C 6 *"); 
        for(i=60; i<=69; i++) {
            if (gameBoard[i] == 1) System.out.print(myColor+ " ");
             if (gameBoard[i] == -1) System.out.print(opColor+" ");
             if (gameBoard[i] == 0) System.out.print("- ");
             if (gameBoard[i] == -2) System.out.print("| ");
            
        }
    System.out.println("*");
    
    System.out.print("C 7 *"); 
        for(i=70; i<=79; i++) {
            if (gameBoard[i] == 1) System.out.print(myColor+ " ");
             if (gameBoard[i] == -1) System.out.print(opColor+" ");
             if (gameBoard[i] == 0) System.out.print("- ");
             if (gameBoard[i] == -2) System.out.print("| ");
            
        }
    System.out.println("*");
      
    System.out.print("C 8 *"); 
        for(i=80; i<=89; i++) {
            if (gameBoard[i] == 1) System.out.print(myColor+ " ");
             if (gameBoard[i] == -1) System.out.print(opColor+" ");
             if (gameBoard[i] == 0) System.out.print("- ");
             if (gameBoard[i] == -2) System.out.print("| ");
        }
    System.out.println("*");
    
    System.out.print("C   *"); 
        for(i=90; i<=99; i++) {
            if (gameBoard[i] == 1) System.out.print(myColor+ " ");
             if (gameBoard[i] == -1) System.out.print(opColor+" ");
             if (gameBoard[i] == 0) System.out.print("- ");
             if (gameBoard[i] == -2) System.out.print("| ");
            
        }
    System.out.println("*");
    System.out.println("C     * * * * * * * * * *");      
      
      
      
      }
      
}//End of nested for loop
  
