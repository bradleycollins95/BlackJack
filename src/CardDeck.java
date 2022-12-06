import java.util.ArrayList;
import java.util.Collections;

/**
 * Class that creates a deck of playing cards using an ArrayList
 * Includes methods to shuffle and draw from the deck
 *
 * @author 20108508
 */
public class CardDeck {
    private final ArrayList<PlayingCard> deck;
    public CardDeck(ArrayList<PlayingCard> deck) {
        this.deck = new ArrayList<>();
        this.makeDeck();
    }

    /**
     * Adds cards into the deck.
     * 13 cards in each of the 4 suits.
     */
    public void makeDeck(){
        for (int i = 0; i < 4; i++) {
            if(i == 0){
                //Adds cards in the deck in order from 1-13
                for(int j = 1; j < 14; j++){
                    deck.add(new PlayingCard(PlayingCard.Suit.DIAMONDS, j));
                }
            }
            if(i == 1){
                for(int j = 1; j < 14; j++){
                    deck.add(new PlayingCard(PlayingCard.Suit.HEARTS, j));
                }
            }
            if(i == 2){
                for(int j = 1; j < 14; j++){
                    deck.add(new PlayingCard(PlayingCard.Suit.SPADES, j));
                }
            }
            if(i == 3){
                for(int j = 1; j < 14; j++){
                    deck.add(new PlayingCard(PlayingCard.Suit.CLUBS, j));
                }
            }
        }
    }

    /**
     * Shuffles the Arraylist deck randomly
     */
    public void shuffleCards(){
        Collections.shuffle(deck);
    }

    /**
     * Generates a random playing card to be printed
     * @return Random card
     */
    public PlayingCard drawCards(){
        return deck.remove(0);
    }

    /**
     * Checks to see if the card deck has any cards left
     * @return the number of cards left
     */

    public void printDeck(){
        for (PlayingCard card: this.deck) {
            System.out.printf("%s ", card.toString());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < deck.size(); i++) {
            sb.append(i + 1);
            sb.append('/');
            sb.append(deck.size());
            sb.append(' ');
            sb.append(deck.get(i));
            sb.append('\n');
        }
        return sb.toString();
    }
}