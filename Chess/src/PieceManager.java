public class PieceManager {
    private Piece[][] positions;
    //White pieces
    King wKing = new King(Color.WHITE);
    Queen wQueen = new Queen(Color.WHITE);
    Bishop wBishop1 = new Bishop(Color.WHITE);
    Bishop wBishop2 = new Bishop(Color.WHITE);
    Knight wKnight1 = new Knight(Color.WHITE);
    Knight wKnight2 = new Knight(Color.WHITE);
    Rook wRook1 = new Rook(Color.WHITE);
    Rook wRook2 = new Rook(Color.WHITE);
    Pawn wPawn1 = new Pawn(Color.WHITE);
    Pawn wPawn2 = new Pawn(Color.WHITE);
    Pawn wPawn3 = new Pawn(Color.WHITE);
    Pawn wPawn4 = new Pawn(Color.WHITE);
    Pawn wPawn5 = new Pawn(Color.WHITE);
    Pawn wPawn6 = new Pawn(Color.WHITE);
    Pawn wPawn7 = new Pawn(Color.WHITE);
    Pawn wPawn8 = new Pawn(Color.WHITE);
    //Black pieces
    King bKing = new King(Color.BLACK);
    Queen bQueen = new Queen(Color.BLACK);
    Bishop bBishop1 = new Bishop(Color.BLACK);
    Bishop bBishop2 = new Bishop(Color.BLACK);
    Knight bKnight1 = new Knight(Color.BLACK);
    Knight bKnight2 = new Knight(Color.BLACK);
    Rook bRook1 = new Rook(Color.BLACK);
    Rook bRook2 = new Rook(Color.BLACK);
    Pawn bPawn1 = new Pawn(Color.BLACK);
    Pawn bPawn2 = new Pawn(Color.BLACK);
    Pawn bPawn3 = new Pawn(Color.BLACK);
    Pawn bPawn4 = new Pawn(Color.BLACK);
    Pawn bPawn5 = new Pawn(Color.BLACK);
    Pawn bPawn6 = new Pawn(Color.BLACK);
    Pawn bPawn7 = new Pawn(Color.BLACK);
    Pawn bPawn8 = new Pawn(Color.BLACK);

    public PieceManager() {
        this.positions = createStartingPosition();
    }

    public Piece[][] createStartingPosition() {
        return new Piece[][] {
                {wRook1, wKnight1, wBishop1, wQueen, wKing, wBishop2, wKnight2, wRook2},
                {wPawn1, wPawn2, wPawn3, wPawn4, wPawn5, wPawn6, wPawn7, wPawn8},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {bPawn1, bPawn2, bPawn3, bPawn4, bPawn5, bPawn6, bPawn7, bPawn8},
                {bRook1, bKnight1, bBishop1, bQueen, bKing, bBishop2, bKnight2, bRook2},
        };
    }

    public Piece[][] getPositions() {
        return positions;
    }
}
