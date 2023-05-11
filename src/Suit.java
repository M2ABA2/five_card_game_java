import java.util.Objects;

public enum Suit {
    Spades,
    Hearts,
    Diamonds,
    Clubs;

    //Handle unitcodes, to avoid a null being returned.
    public String toString() {
        switch (this) {
            case Spades:
            return Objects.requireNonNullElse("\u2660", "spades"); // "♠" - Spades
            case Hearts:
                return Objects.requireNonNullElse("\u2665", "hearts"); // "♥" - Hearts
            case Diamonds:
            return Objects.requireNonNullElse("\u2666","diamonds"); // "♦" - Diamonds
            case Clubs:
            return Objects.requireNonNullElse("\u2663", "clubs"); // "♣" - Clubs
            default:
                throw new IllegalArgumentException("Invalid Card");
        }
    }
}

