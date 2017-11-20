
package OthelloProject;



import static OthelloProject.Game.boards;
import static OthelloProject.Game.currentColor;
import static OthelloProject.Game.currentPlayer;
import static OthelloProject.Game.gameBoard;
import static OthelloProject.Game.notPlayer;
import java.util.ArrayList;



/**
 *
 * @author Michael
 */
public class LegalMoves {


   
    
    
    public static boolean gameOver (int [] solution) {
         if (solution.length ==0) return true;
        else return false;
            
    }
     
           
    public static int [] findTheMoves() {
        int i=0; //variable used to go through board
        int k =0;// variable used to go through Move array
        int location; //the new boardlocation after moving some distance
        int z = 0,pieceCount=0; //variable used to go through stored locations that worked. and tell how many pieces are being flipped. 
        int [] local = new int [200]; // array that stored locations that work. 
        int [] captured = new int [200];
        
        int [] move = {1,-1,-10,10,9,-9,11,-11}; //the moves in my board Left right up down...
        boards = gameBoard;
        
        for (i=11; i<89; i++){    //Itterate through board
            if (boards[i]==currentPlayer) 
                for (k =0; k<move.length; k++){
                    location = i+ move[k];
                    
                    while(boards[location] == notPlayer) {   // if board location is opponent keep moving
                         
                        location += move[k];
                        pieceCount++;                   // move one location more
                        if (boards[location] == 0) {        // if its an open space we have a legal move
                            local[z] = location;               // store location of legal move
                            captured[z] = pieceCount;
                            System.out.println(move[k]);
                            z++;
                            break;
                        }// end of if
                    
                    }// end of while
                    pieceCount =0;
            
                }//End of for loop Moves

        }// End of for loop Board
        for (int a =0; a<z; a++){
            System.out.println(local[a]);
            
        }
        
        int loc =quickSearch(captured);
        returnMove(local[loc]);
        flipBits(local[loc]);
      // ArrayList<int[]>list = new ArrayList<>();  
      
     /* 
      for(int v=0; v< 2; v++){
          boards = gameBoard;
          LegalMoves.flipBits(local[v]);
         list.add(v,(boards)); 
         
      }
      */
      
        return local;
    }// end of Find moves
    
    public static int quickSearch(int pieces [] ){
        int big =0;
        int loc =0;
        int i =0;
        for(i=0;i<pieces.length;i++){
            if(big<pieces[i]) {
                big=pieces[i];
                loc =i;
            }//end of if
        }//end of for
        return loc;
    }//end of quickSearch
    
    public static void flipBits(int location){
    int [] move = {1,-1,-10,10,9,-9,11,-11};
        gameBoard = gameBoard;
        int i,k;
        int spot = location;
        gameBoard[location] = currentPlayer;
           
           
           spot = location;
        //System.out.println(spot);
        
        for (k=0; k<move.length; k++){
            
            location=location +(move[k]);
                if (gameBoard[location]==notPlayer) {
                 
                    for (i=1; i<8; i++){
                        
                        location = location + (move[k]);
                        if (gameBoard[location]==0 || boards[location] ==-2) { 
                        break;}
                        else if (gameBoard[location]==currentPlayer && location != spot){
                          
                            for (int j=0; j<i; j++){
                                location -= (move[k]); 
                                if (gameBoard[location]==notPlayer){
                                    gameBoard[location]=currentPlayer; 
                                }
                            }//end of innter for
                        }//end of last if
              
                    }//end of forloop
                }//end of if
            location= spot;   
        }//End of For k
        
    }// end flipBits
    
    
    public static void returnMove(int location) {
       
          char collum = 'X';
          
                                                    //take convert number into rows and collums
          int row;
           if ( location %10 == 1  ) collum = 'a';
           if ( location %10 == 2  ) collum = 'b';
           if ( location %10 == 3  ) collum = 'c';
           if ( location %10 == 4  ) collum = 'd';
           if ( location %10 == 5  ) collum = 'e';
           if ( location %10 == 6  ) collum = 'f';
           if ( location %10 == 7  ) collum = 'g';
           if ( location %10 == 8  ) collum = 'h';
          
           row = ((location - location% 10) / 10);
           //System.out.println (location);           // the location in Array
           
           if (location<89) {System.out.printf("%c %c %d\n", currentColor,collum, row); 
                boards[location] = currentPlayer;}
           else System.out.printf("%c\n",currentColor);
           
           
       
    }// end return move
    
    
    public static void takeMoves(char color, char col, int row) {
           int spot;
           int location;
           int collum =0;
           int i,k;
           if ( col == 'a'  ) collum = 1;
           if ( col == 'b'  ) collum = 2;
           if ( col == 'c'  ) collum = 3;
           if ( col == 'd'  ) collum = 4;
           if ( col == 'e'  ) collum = 5;
           if ( col == 'f'  ) collum = 6;
           if ( col == 'g'  ) collum = 7;
           if ( col == 'h'  ) collum = 8;
           
           row = row*10;
           location = row + collum;
           flipBits(location);
         
    }// end of recieve moves

    }//End of legalMoves


