import poker.HandRank;
import poker.HandEvaluator;


public class Ranking {

    public static String rankHand(String data) {

        try{
            System.out.println(data);
            HandRank handRank = HandEvaluator.evaluate(data);

            // Get the rank of the hand
            String handRankString = handRank.toString();

            // Print the hand rank
        // System.out.println("Hand Rank: " + handRankString);
            return handRankString;

        }catch(Exception ex){
            return null;
        }
        
    }

}