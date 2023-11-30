import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Board board = new Board();
        Scanner input = new Scanner(System.in);

        //Start the game loop
        boolean playing = true;
        while (playing) {
            //Ask who is playing
            String[] playerNames = choosingPlayerNames(input);
            Game game = new Game(playerNames[0], playerNames[1]);
            //TODO: alternating between players, let them move around pieces. Change turns in between.

            //TODO: translate A1 etc to coordinates for 2D array
            //board.canMakeMove(from, to);
            //board.move();

            //TODO: Check if there is a "check". Next player has to get rid of the "check".

            //TODO: Check if there is a "checkmate" and a WINNER
            //TODO: Check if there is a "stalemate" and NO WINNER
            playing = false;
        }
    }

    public static String[] choosingPlayerNames(Scanner input) {
        boolean choosing = true;
        String player1 = "";
        String player2 = "";

        while(choosing) {
            System.out.println("Let's play Chess!");
            System.out.println("What is your name player 1?");
            player1 = input.nextLine();
            System.out.println("Allright, " + player1 + "! And what is your name player 2?");
            player2 = input.nextLine();
            System.out.println("Player 1: " + player1);
            System.out.println("Player 2: " + player2);
            System.out.println("Are you sure? (if not, choose: no/n)");
            String answer = input.nextLine();
            //Check if the players are satisfied with the chosen names
            if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
                System.out.println("No problem!");
                System.out.println("Restarting in 3, 2, 1...");
            } else {
                System.out.println("Starting game!");
                choosing = false;
            }
        }

        return new String[] {player1, player2};
    }
}