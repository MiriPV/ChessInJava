public class Board {
    PieceManager pieceManager;
    private final Integer[] rows = {8, 7, 6, 5, 4, 3, 2, 1};
    private final String[] cols = {"A", "B", "C", "D", "E", "F", "G", "H"};

    public Board() {
        pieceManager = new PieceManager();
    }

    public void drawBoard() {
        Piece[][] positions = pieceManager.getPositions();
        for(int row = 0; row < 8; row++) {
            //Print out row names
            System.out.print(rows[row] + " ");
            for(int col = 0; col < 8; col++) {
                System.out.print("|");
                //if there is no piece, print out __
                if (positions[row][col] == null) {
                    System.out.print("__");
                } else {
                    //if there is a piece, print out the name of the piece
                    Piece piece = positions[row][col];
                    String name = piece.getName();
                    System.out.print(name);
                }
            }
            System.out.println("|");
        }
        //Print out column names
        System.out.print("   ");
        for (String col: cols) {
            System.out.print(col + "  ");
        }
    }

    public boolean canMakeMove() {
        Piece[][] positions = pieceManager.getPositions();
        //TODO: what piece is moving?
        //TODO: is this move valid? piece.moveIsValid(int row1, int col1, int row2, int col2);
        //Piece movingPiece = positions[col][row];
        //return movingPiece.moveIsValid(col1, row1, col2, row2);
        return false;
    }

    public void move() {
        //TODO: move piece to new position, old position is now empty
        //TODO: if needed: Remove piece that's currently in the new position
    }
}
