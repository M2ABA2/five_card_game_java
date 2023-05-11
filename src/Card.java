/*
 * Defines and returns the card number and its suit.
 */
public class Card {
    private Suit suit;
    private int value;

    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public String toString() {
        return value + " " + suit;
    }
}