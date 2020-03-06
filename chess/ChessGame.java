import java.awt.Color;

public class ChessGame{
    private Board board;

    public ChessGame(){
        this.board = new Board();
    }

    public void placeRook(Board board,int rank, int file) {
        // clearBoard();
        int influence = 0;
        board.getSquare(rank,file).setPiece("r");
        for(int row =1; row <= 8; row++){
            for(int col = 1; col <= 8; col++){
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
    
    public void placeKnight(Board board,int rank, int file) {
        // clearBoard();
        int influence = 0;
        board.getSquare(rank,file).setPiece("k");
        for(int row = 1; row <=8; row++ ){
            for(int col = 1; col <=8; col++){
               if(row != rank && col != file && Math.abs(row - rank) + Math.abs(col - file) == 3){
                   board.getSquare(row, col).toggleHighlight();
                   influence= influence + 1;
               }
            }
        }
        System.out.println("Knight's Influence: " + influence);
    }

    public void placeBishop(Board board, int rank, int file){
        int influence = 0;
        board.getSquare(rank, file).setPiece("b");
        for(int row = 1; row <= 8; row++){
            for( int col = 1 ; col <= 8; col++){
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

    public void placeQueen(Board board, int rank, int file){
        int influence = 0;
        board.getSquare(rank, file).setPiece("Q");
        for(int row = 1; row <= 8; row++){
            for(int col = 1; col <=8; col++){
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
        System.out.println("Queen's Influence: " + influence);
    }

    public void mostInfluence(int rank, int file){
        int influence = 0; 

    }

    public static void main(String[]args){
        Board board = new Board();
        ChessGame game = new ChessGame();
        // game.placeRook(board,2,3);
        // game.placeBishop(board, 4, 4);
        // game.placeKnight(board, 6, 4);
        game.placeQueen(board, 5, 5);
        System.out.println(board);
    }
}