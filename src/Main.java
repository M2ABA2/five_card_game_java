import java.util.Arrays;
//import github.com/poker-hand-evaluator/Hand;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Card[] firstFiveCards = deck.getFirstFiveCards();
        String hand = Arrays.toString(firstFiveCards);
        System.out.println("Your hand:"+ hand);
       // for (Card card : firstFiveCards) {
        //    System.out.println("Your hand:"+ card);
        //}

        // Evaluate a hand
        //int value = Hand.evaluate(hand);
    }
}