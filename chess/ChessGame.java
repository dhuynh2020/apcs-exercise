import java.awt.Color;
import java.util.ArrayList;
public class ChessGame{
    private Board board;

    public ChessGame(){
        this.board = new Board();
    }

    public void placeRook(int rank, int file) {
        // clearBoard();
        int influence = 0;
        board.getSquare(rank,file).setPiece("r");
        for(int row = 1; row <= board.getWid(); row++){
            for(int col = 1; col <= board.getLen(); col++){
                if(row == rank){
                    board.getSquare(row, col).toggleHighlight();
                    influence++; 
                }
                if(col == file){
                    board.getSquare(row, col).toggleHighlight();
                    influence++; 
                }
                
            }
        }
        influence = influence - 2;
        System.out.println("Rook's Influence: " + influence);
    }
    
    public void placeKnight(int rank, int file) {
        // clearBoard();
        int influence = 0;
        board.getSquare(rank,file).setPiece("k");
        for(int row = 1; row <= board.getWid(); row++){
            for(int col = 1; col <= board.getLen(); col++){
               if(row != rank && col != file && Math.abs(row - rank) + Math.abs(col - file) == 3){
                   board.getSquare(row, col).toggleHighlight();
                   influence= influence + 1;
               }
            }
        }
        System.out.println("Knight's Influence: " + influence);
    }

    public void placeBishop( int rank, int file){
        int influence = 0;
        board.getSquare(rank, file).setPiece("b");
        for(int row = 1; row <= board.getWid(); row++){
            for(int col = 1; col <= board.getLen(); col++){
                int rankDist = Math.abs(rank - row);
                int fileDist = Math.abs(file - col);
                if (rankDist == fileDist){
                    board.getSquare(row, col).toggleHighlight();
                    influence = influence + 1;
                    }
                }
            }
        
        System.out.println("Bishop's Influence: " + influence);
    }


    public String toString(){
        return board.toString();
    }

    public int placeQueen(int rank, int file){
        int influence = 0;
        board.getSquare(rank, file).setPiece("Q");
        for(int row = 1; row <= board.getWid(); row++){
            for(int col = 1; col <= board.getLen(); col++){
                int rankDist = Math.abs(rank - row);
                int fileDist = Math.abs(file - col);
                if (rankDist == fileDist){
                    board.getSquare(row, col).toggleHighlight();
                    influence = influence + 1;
                }
                if( rank == row){
                    board.getSquare(row, col).toggleHighlight();
                    influence++;
                }
                if( file == col){
                    board.getSquare(row, col).toggleHighlight();
                    influence++;
                }
            }
        }
        influence = influence - 2; 
        // System.out.println("Queen's Influence: " + influence);
        return influence;
    }

    public Integer[] maxQueenPositions(){
        ArrayList<Integer[]> positions = new ArrayList<>();
        Integer[] pos = new Integer[2];
        int mostInfluence = 0;

        // Gets the most Influence
        for(int row = 1; row <= board.getWid(); row++){
            for(int col = 1; col <= board.getLen(); col++){
                if(placeQueen(row,col) > mostInfluence){
                    mostInfluence = placeQueen( row, col);
                }
            }
        }

        for(int row = 1; row <= board.getWid(); row++){
            for(int col = 1; row <=board.getLen(); row++){
                if(placeQueen(row,col) == mostInfluence ){
                    pos[0] = row;
                    pos[1] = col; 
                    positions.add(pos);
                }
            }
        }
        return pos;
    }

    // public square 

    public static void main(String[]args){
        Board board = new Board();
        ChessGame game = new ChessGame();
        // game.placeRook(2,3);
        // game.placeBishop(4, 4);
        // game.placeKnight(6, 4);
        game.placeQueen(5, 5);
        // game.mostInfluence();
        System.out.println(game);

    }
}