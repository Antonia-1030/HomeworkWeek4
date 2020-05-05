package chess.pieces;

public abstract class Piece {
    public Square getPosition(){
        return this.position;
    }
    public void setPosition(Square pozicia){
        this.position=pozicia;
    }
    public List<Square> getMovement(Board b);
    public final PIECE_NAME = NAME;
}
