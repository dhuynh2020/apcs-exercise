import java.awt.Color;

public class ChessGame{
    private Board board;

    public ChessGame(){
        this.board = new Board();
    }

    public void placeRook(Board board,int rank, int file) {
        // clearBoard();
        board.getSquare(rank,file).setPiece("r");
        for(int row =1; row <= 8; row++){
            for(int col = 1; col <= 8; col++){
                if(row == rank){
                    board.getSquare(row, col).toggleHighlight();
                }
                if(col == file){
                    board.getSquare(row, col).toggleHighlight();
                }
            }
        }
    }
    
    public void placeKnight(int rank, int file) {
        // clearBoard();
        board.getSquare(rank,file).setPiece("k");
        for(int row = 1; row <=8; row++ ){
            for(int col = 1; col <=8; col++){
                if( row == rank){
                    board.getSquare(row,col).toggleHighlight();
                }
                if(col == file){
                    board.getSquare(row, col).toggleHighlight();
                }
            }
        }
    }

    public static void main(String[]args){
        Board board = new Board();
        ChessGame game = new ChessGame();
        game.placeRook(board,2,3);
        System.out.println(board);
    }
}