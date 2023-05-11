/*
 * Separtes the 52 cards into 4 types that each contain 13 cards.
 * 
 */
import java.util.Arrays;
import java.util.Random;
import com.five_card_game.Card;

public class Deck {
    private static final int NUM_SUITS = 4;
    private static final int NUM_CARDS = 13;
    private Card[] cards;

    public Deck() {
        cards = new Card[52];
        int index = 0;

        for (int i = 0; i < NUM_SUITS; i++) {
            for (int j = 0; j < NUM_CARDS; j++) {
                cards[index] = new Card(Suit.values()[i], j + 1);
                index++;
            }
        }
    }

    //Shuffles the cards and return the first 5 elements in the shuffled deck.
    public void shuffle() {
        Random rand = new Random();
        System.out.println("Shuffling ... Shuffling ... Shuffling ...");

        for (int i = cards.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public Card[] getFirstFiveCards() {
        return Arrays.copyOfRange(cards, 0, 5);
    }
}
