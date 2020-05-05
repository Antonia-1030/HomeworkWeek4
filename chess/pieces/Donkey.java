package chess.pieces;

public class Donkey extends Piece {
    public List<Square> getMovementOptions(Board b) {
        public boolean canMove(int row, int col){
        return (Math.abs(this.row - row) == 2 || Math.abs(this.col - col) == 2
                || Math.abs(this.row - row) == Math.abs(this.col - col));
        }
        public final NAME = "Donkey";
    }
}
