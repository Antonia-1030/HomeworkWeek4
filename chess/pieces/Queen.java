package chess.pieces;

public class Queen extends Piece {
    public List<Square> getMovementOptions(Board b){
        public boolean canMove(int row, int col){
        return (Math.abs(this.row - row) == Math.abs(this.col - col));
        }
        public final NAME = "Queen";
    }
}
