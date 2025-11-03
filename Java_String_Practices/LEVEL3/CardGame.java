import java.util.Scanner;

public class CardGame {
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    static int numOfCards = suits.length * ranks.length;

    static String[] initializeDeck() {
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }
    static String[][] distributeCards(String[] deck, int n, int x) {
        if (n > deck.length) {
            System.out.println("Not enough cards in the deck.");
            return null;
        }
        if (n % x != 0) {
            System.out.println("Cannot evenly distribute " + n + " cards to " + x + " players.");
            return null;
        }

        String[][] hands = new String[x][n / x];
        int cardIndex = 0;

        for (int i = 0; i < n / x; i++) {
            for (int j = 0; j < x; j++) {
                hands[j][i] = deck[cardIndex++];
            }
        }
        return hands;
    }
    static void printPlayerHands(String[][] hands) {
        if (hands == null) return;
        for (int i = 0; i < hands.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : hands[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of cards to deal (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter number of players (x): ");
        int x = scanner.nextInt();

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        String[][] hands = distributeCards(deck, n, x);
        printPlayerHands(hands);
    }
}
