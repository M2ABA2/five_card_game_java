import java.util.Arrays;
import com.five_card_game.Deck;
import com.five_card_game.Card;
import com.five_card_game.Ranking;

public class Main {
    public static void main(String[] args) {

        //Return a shuffled deck.
        Deck deck = new Deck();
        deck.shuffle();
        
        //Return the first five elements of the huffled deck.
        Card[] firstFiveCards = deck.getFirstFiveCards();
        String hand = Arrays.toString(firstFiveCards);
        System.out.println("Your hand:"+ hand);


        //Return the rank.
        Ranking rank = new Ranking();
        try{
           String r = rank.rankHand(hand);
             // Print the hand rank
        System.out.println("Hand Rank: " + r);
        }catch(Exception ex){
           System.out.println("Could not get hand");
        }
        

      
    }
}