interface Piece {
    String getType();
    Enum<Color> getColor();
    boolean moveIsValid(int row1, int col1, int row2, int col2);
    default String getName() {
        if (getColor() == Color.WHITE) {
            return "w" + getType();
        } else {
            return "b" + getType();
        }
    }
}
