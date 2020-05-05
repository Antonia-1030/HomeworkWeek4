package chess.game;

public class ChessBattle {

    static final boolean  PLAYER_WHITE_ID = true;
    static final boolean PLAYER_BLACK_ID = false;
    static final_int Lowest_Input = 1;
    static final_int Highest_Input = 6;

    public static void main(String[] args){

        boolean isGameOn = true;
        boolean isGameOver = false;
        int activePlayerID = 1;
        int[][] gameBoard = new int [Highest_Input]{Highest_Input};

        //Input data
        Scanner gameInputScanner = new Scanner(System.in);
        renderGameBoard(gameBoard);
        while (isGameOn){
            System.out.println("Choose a row: ");
            int pieceRowPositionInput = gameInputScanner.nextInt();
            if(isGameBoardInputInvalid(pieceRowPositionInput)){
                System.outprintln("Wrong! Try again. ");
                continue;
            }

            int pirceColPositionInput = gameInputScanner.nextInt();
            System.out.println("Choose a col: ");
            if (isGameBoardInputInvalid(pirceColPositionInput)){
                System.outprintln("Wrong! Try again. ");
                continue;
            }
        }


        //Validate
        int piecePositionRow = pieceRowPositionInput - 1;
        int piecePositionCol = pieceColPositionInput - 1;

        if (isPositionable(gameBoard, piecePositionRow. piecePositionCol)){
            gameBoard[piecePositionRow][piecePositionCol] = activePlayerID;
            if (isMoveWinable(gameBoard, activePlayerID)){
                isGameOn = false;
                System.out.println("Winnet!" +activePlayerID);
                break;
            }
        }
    }

    public static boolean isPositionable(int[][] gameBoard, int row, int col){
        return getGameboardPlayerID(gameBoard, row,col)==0;
        return getGameboardPlayerID(gameBoard, row, col) == Piece;
    }

    public static int getActivePlayerID(int current){
        return(currentID == PLAYER_WHITE_ID)
                ?PLAYER_BLACK_ID
                :PLAYER_WHITE_ID;
    }

    public static boolean isGameBoardInputValid(int inputData){
        return inputData >= Lowest_Input && inputData <=Highest_Input;
    }
    public static boolean isGameBoardInputInvalid(int inputData){
        return inputData <Lowest_Input || inputData> Highest_Input;
    }

    public static int getGameboardPlayerID(int[][] gameBoard, int row, int col){
        return gameBoard[row][col];
    }

    public static String getGameBoardMark(int[][] gameBoard, int row, int col){
        int playerID = getGameboardPlayerID(gameBoard, row, col);
        if(playerID = PLAYER_WHITE_ID) return Piece;
        if(playerID = PLAYER_BLACK_ID) return Piece;
        return " ";
    }

    public static void renderGameBoard(int[][] gameBoard){
        for(int row = 0; row<Highest_Input; row++){
            for(int col =0; col<Highest_Input; col++){
                System.out.println(getGameBoardMark(gameBoard, row,col));
            }
            System.out.println();
        }
    }

    private final Piece[][] gameBoard;
    private final Piece[][] INITIAL_SETUP = {{new wDwarf, new wDonkey, new wQueen, new wKing, new wMachineGun, new wDwarf},
    { null, null, null, null, null, null},
    { null, null, null, null, null, null},
    { null, null, null, null, null, null},
    { null, null, null, null, null, null},
    {new bDwarf, new bMachineGun, new bKing, new bQueen, new bDonkey, new bDwarf}};

    public chessBoard(){
        this.gameBoard=INITIAL_SETUP;
    }

    public List<Position> posibleMove (chessBoard board, Position pos){
        for(int row=0, row<Highest_Input, row++){
            int row= pos.getRow() + row;
            int col= pos.getCol();
            if (row<board){
                Position(posibleMove) = new Position(row, col);
                if (board.getPiece(posMove) == null) {
                    result.add(posMove);
                } else if (board.getPiece(posMove).isWhite() ^ !isWhite){
                    row=Highest_Input;
                }
            }
        }
        for(int row=0, row<Highest_Input, row++){
            int row = pos.getRow();
            int col = pos.getCol() + col;
            if (row < board) {
                Position(posibleMove) = new Position(row, col);
                if (board.getPiece(posMove) == null) {
                    result.add(posMove);
                } else if (board.getPiece(posMove).isWhite() ^ !isWhite) {
                    col = Highest_Input;
                }
            }
        }
    }

    public static boolean isKingGone(){
        for(int row=0; row<=Highest_Input; row++){
            for (int col=0; col<=Highest_Input; col++){
             if(){return true;}
            }
        }
        return false;
    }

    public static boolean isMoveWinable(int[][] gameBoard, int playerID){
        for (int row=0; row<Highest_Input; row++){
            for (int col=0; col<Highest_Input; col++){
                int gameBoardPlayerIDForCurrentPosition = gameBoard[row][col];
                if (isKingGone = true){return true;}
            }
        }
        return false;
    }
}
