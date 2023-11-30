public class Pawn implements Piece {
    private final Enum<Color> color;

    public Pawn(Enum<Color> color) {
        this.color = color;
    }

    @Override
    public String getType() {
        return "P";
    }

    @Override
    public Enum<Color> getColor() {
        return color;
    }

    @Override
    public boolean moveIsValid(int row1, int col1, int row2, int col2) {
        //TODO: can this piece move this way?
        //TODO: are there pieces blocking this path? Making the move invalid?
        return false;
    }
}
