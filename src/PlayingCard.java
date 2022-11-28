/**
 * Playing card for a standard american deck
 *
 * Playing Cards are not meant to initialize themselves,
 * they should be generated as part of a deck of cards, by
 * another safe, secure method in the factory object
 * @author 20168333
 */

public class PlayingCard {
    public enum Suit {HEARTS, DIAMONDS, SPADES, CLUBS};

    public enum CardFace {
        A("A"), Two("2"), Three("3"), Four("4"), Five("5"),
        Six("6"), Seven("7"), Eight("8"), Nine("9"), Ten("10"),
        J("J"), Q("Q"), K("K");
        final String value;
        CardFace(String value) {
            this.value = value;
        }
    };

    private final CardFace faceValue;
    private final Suit suit;

    /**
     * Constructor to create cards. This method for testing.
     * The final code will use the factory class.
     * @param faceValue
     * @param suit
     */
    public PlayingCard(CardFace faceValue, Suit suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    /**
     * Get Face Value
     * @return
     */
    public CardFace getFaceValue() {
        return faceValue;
    }

    /**
     * Get the suit value
     * @return
     */
    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return this.faceValue.value + getSuitStringValue(this.getSuit());
    } // overrides to string format of face value + suit "8♣"

    /**
     * A System method to message 'Suits' of American style playing
     * cards. Uses the unicode values to add ascii characters as seen
     * on real playing cards.
     * @param suit
     * @return
     */
    public static String getSuitStringValue(Suit suit ) {
        StringBuilder suits = new StringBuilder();
        suits.append(" ");
        if (suit == Suit.SPADES) {                  // if param suit is spades
            suits.append((char)'\u2660');           // appends the unicode version of spades
        } else if (suit == Suit.HEARTS) {           // if hearts
            suits.append((char)'\u2764');           // append hearts unicode
        } else if (suit == Suit.DIAMONDS) {         // if diamonds
            suits.append((char)'\u2666');           // append diamonds unicode
        } else {                                    // if it is anything other than those 3 only other option is clubs
            suits.append((char)'\u2663');           // append unicode version of clubs
        }
        return suits.toString();
    }

}