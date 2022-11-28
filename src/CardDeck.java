import java.util.ArrayList;
import java.util.Collections;

/**
 * Class that creates a deck of playing cards using an ArrayList
 * Includes methods to shuffle and draw from the deck
 * <pre>
 * c) Create a class called ‘CardDeck’ that has the following methods:
 * - Has an ArrayList of Playing cards
 * - Starts with a full deck of cards
 * - Can be shuffled
 * - Can draw a card
 * - Create an application with a menu that lets you:
 *  a) draw a card
 *  b) draw a hand
 *  c) print the deck
 *  d) shuffle the deck
 *  e) print out the deck
 * @author 20108508
 * </pre>
 */
public class CardDeck {
    private ArrayList<PlayingCard> deck;
    public CardDeck(ArrayList<PlayingCard> deck) {
        this.deck = new ArrayList<>();
        this.makeDeck();
    }

    /**
     * Adds cards into the deck.
     * 13 cards in each of the 4 suits.
     * @return nothing
     */
    private PlayingCard makeDeck(){
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
        return null;
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

    public void printDeck(){
        for (PlayingCard card: this.deck) {
            System.out.printf("%s ", card.toString());
        }
    }
}