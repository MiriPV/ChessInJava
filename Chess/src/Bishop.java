public class Bishop implements Piece {
    private final Enum<Color> color;

    public Bishop(Enum<Color> color) {
        this.color = color;
    }

    @Override
    public String getType() {
        return "B";
    }

    @Override
    public Enum<Color> getColor() {
        return color;
    }

    @Override
    public boolean moveIsValid(int col1, int row1, int col2, int row2) {
        //TODO: can this piece move this way?
        //TODO: are there pieces blocking this path? Making the move invalid?
        return false;
    }
}
