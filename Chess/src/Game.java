public class Game {
    String nameWhite;
    String nameBlack;
    Enum<Color> turn;

    public Game(String player1, String player2) {
        this.nameWhite = player1;
        this.nameBlack = player2;
        turn = Color.WHITE;
    }

    public String getNameWhite() {
        return nameWhite;
    }

    public String getNameBlack() {
        return nameBlack;
    }

    public Enum<Color> getTurn() {
        return turn;
    }

    public void changeTurn() {
        if (turn == Color.WHITE) {
            turn = Color.BLACK;
        } else {
            turn = Color.WHITE;
        }
    }
}
