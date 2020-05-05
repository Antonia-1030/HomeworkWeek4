package chess.pieces;

public class MachineGun extends Piece {
    public List<Square> getMovementOptions(Board b){
        public boolean canMove ( int row, int col){
        return (Math.abs(this.row - row) == 1 || Math.abs(this.col - col) == 1
                && Math.abs(this.row - row) != Math.abs(this.col - col));
        }
        public final NAME = "Machine Gun";
    }
}
