package chess.pieces;

public class Dwarf extends Piece {
    public List<Square> getMovementOptions(Board b){
        public boolean canMove(int row, int col) {
        return (this.row != row && Math.abs(this.col - col) == 1);
        }
        public final String NAME = "Dwarf";
    }
}