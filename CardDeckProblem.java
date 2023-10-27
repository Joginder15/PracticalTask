import java.util.Scanner;

public class CardDeckProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of players: ");
        int numOfPlayers = scanner.nextInt();

        System.out.print("Enter the number of cards: ");
        int numOfCards = scanner.nextInt();

        int[] cardsReceived = new int[numOfPlayers];

        for (int i = 1; i <= numOfCards; i++) {
            int currentPlayer = (i - 1) % numOfPlayers;
            cardsReceived[currentPlayer] += i;
        }

        for (int i = 0; i < numOfPlayers; i++) {
            System.out.println("Player " + (i+1) + " - " + cardsReceived[i]);
        }
    }
}

