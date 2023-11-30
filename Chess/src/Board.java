public class Board {
    private Piece[][] pieces;
    private final Integer[] rows = {8, 7, 6, 5, 4, 3, 2, 1};
    private final String[] cols = {"A", "B", "C", "D", "E", "F", "G", "H"};

    public Board() {
        this.pieces = createPieces();
    }

    public Piece[][] createPieces() {
        //create pieces
        Piece king = new Piece("K");
        Piece queen = new Piece("Q");
        Piece bishop = new Piece("B");
        Piece knight = new Piece("K");
        Piece rook = new Piece("R");
        Piece pawn = new Piece("P");

        //set up the pieces on the correct starting position
        pieces = new Piece[][]{
                {rook, knight, bishop, queen, king, bishop, knight, rook},
                {pawn, pawn, pawn, pawn, pawn, pawn, pawn, pawn},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {pawn, pawn, pawn, pawn, pawn, pawn, pawn, pawn},
                {rook, knight, bishop, queen, king, bishop, knight, rook}
        };
        return pieces;
    }

    public void drawBoard() {
        for(int row = 0; row < 8; row++) {
            //Print out row names
            System.out.print(rows[row] + " ");
            for(int col = 0; col < 8; col++) {
                System.out.print("|");
                //if there is no piece, print out _
                if (pieces[row][col] == null) {
                    System.out.print("_");
                } else {
                    //if there is a piece, print out the type
                    Piece piece = pieces[row][col];
                    String type = piece.getType();
                    System.out.print(type);
                }
            }
            System.out.println("|");
        }
        //Print out column names
        System.out.print("   ");
        for (String col: cols) {
            System.out.print(col + " ");
        }
    }
}
