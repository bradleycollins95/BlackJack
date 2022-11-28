import java.util.*;

public class PlayingCardFactory {

    /**
     * Generate a random playing card for testing purpose
     * @return Playing Card
     */
    private static final int facesLength = PlayingCard.CardFace.values().length;           // length of card enum = 13
    private static final int suitsLength = PlayingCard.Suit.values().length;               // length of card suits enum = 4
    public static PlayingCard generatePlayingCard() {
        Random random = new Random ();                                                     // random number
        return new PlayingCard(PlayingCard.CardFace.values()[random.nextInt(facesLength)], // random value in enum CardFace for the face value
                PlayingCard.Suit.values()[random.nextInt(suitsLength)]);                   // random value in Suit enum for the suit value
    }

    /**
     * Core method of systems to yield a random American playing card for the
     * standard 52 cards in a deck.
     * @param suit
     * @return
     */
    public static PlayingCard generatePlayingCardFromSuit(PlayingCard.Suit suit) {
        Random random = new Random ();
        return new PlayingCard(PlayingCard.CardFace.values()[random.nextInt(facesLength)], // random value in enum CardFace for the face value
                suit);                                                                     // parameter suit for suit choice
    }

}
