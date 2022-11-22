/**
 * Class that generates a playing card
 * Based off of the western card game (52 card)
 * There are no joker cards in the generator
 * Values are 2-10 for card face numerically.
 * 1 is A ("Ace"), 11 is J ("Jack"), 12 is Q ("Queen"), 13 is K ("King")
 *
 * The cards are not created themselves, they will be generated as a complete back of cards
 * by using a factory object
 *
 * @author 20108508
 */
public class PlayingCard {

    public enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES};

    //TODO rethink
    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    //TODO rethink
    private int cardNumber;
    private Suit suit;

    /**
     * Card creation constructor
     * @param cardNumber
     * @param suit
     */
    public PlayingCard(int cardNumber, Suit suit) {
        this.cardNumber = cardNumber;
        this.suit = suit;
    }

    /**
     * Get face value
     * @return
     */
    public int getCardNumber() {
        return cardNumber;
    }

    /**
     * Get suit value
     * @return
     */
    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        //TODO Write to display cards as "VALUE FACE" (ex: 9 hearts) - use ASCII chars
        return String.valueOf(this.cardNumber = Integer.parseInt(getSuitStringValue(this.getSuit())));
    }

    public static String getSuitStringValue(Suit suit){
        if (suit == Suit.CLUBS){
            return "CLUBS";
        } else if (suit == Suit.DIAMONDS){
            return "DIAMONDS";
        } else if (suit == Suit.HEARTS){
            return "HEARTS";
        } else {
            return "SPADES";
        }
    }

    public static int getCardFaceValue(int cardNumber){
        if (cardNumber == 1){
            return Integer.parseInt("ACE");
        } else if (cardNumber == 11){
            return Integer.parseInt("JACK");
        } else if (cardNumber == 12){
            return Integer.parseInt("QUEEN");
        } else if (cardNumber == 13){
            return Integer.parseInt("KING");
        }
        return cardNumber;
    }
}