import java.util.*;

/**
 * Main class used for the operation of a standard American card deck of
 * 52 cards. Provides methods for shuffling the deck, printing the deck,
 * and removing one card from the deck ('drawing a card'). There is a
 * sub-method for requirements (b) to draw a random card by naming the
 * suit it belongs to. The last method creates a 'hand' of cards which is
 * a collect of N cards from the deck of 52 uniques cards.
 */
public class CardDeck {
    private ArrayList<PlayingCard> deck = new ArrayList<PlayingCard>();
    public CardDeck() {
        for (PlayingCard.Suit suit: PlayingCard.Suit.values()) {// for suit in the enum print each suit value
            for(PlayingCard.CardFace cardFace: PlayingCard.CardFace.values()) { // for every suit print
                PlayingCard playingCard = new PlayingCard(cardFace, suit);
                deck.add(playingCard);
            }
        }
    }

    /**
     * Method for printing the whole deck of 53 cards
     * @param
     */
    public void printDeck() {
        if(deck.isEmpty()) {
            this.reset();
        }
        for (PlayingCard playingCard: deck) { // for playingcard from the playing card class, print each playing card from the deck
            System.out.println(playingCard);
        }
    }

    /**
     * A method to randomly mix up the 52 cards values within the arraylist
     * that is utilized as the data structure to render them.
     * @param
     */
    public void shuffleDeck() {
        if(deck.isEmpty()) {
            this.reset();
        }
        Collections.shuffle(deck); // shuffles deck
    }

    /**
     * Core method to select a random card of the 52 cards in a standard American playing
     * card deck.
     * @return 1 card as string and ascii art to the console.
     */
    public PlayingCard drawCard() {

        if(deck.isEmpty()) {
            this.reset();
        }

        PlayingCard playingCard = PlayingCardFactory.generatePlayingCard(); //generated card
        ArrayList<PlayingCard> removeCard = new ArrayList<PlayingCard>(); //empty list to add too when cards need to be removed
        removeCard.add(playingCard); //adds the drawn card(s)
        deck.removeAll(removeCard); //removes the card(s) from the play deck when drawn
        return playingCard; //returns the card that's drawn
    }

    /**
     * Core method to get a random card from within one of the four suit collections. A suit
     * of cards is one of four values (spades, hearts, diamonds, clubs). This methods gets a
     * random face value card from the range 2 - 10, J,K,Q,A and displays it from the suit that
     * was used provided at the console.
     * @param suit
     * @return 1 playing card at the console via string and ascii art.
     */
    public PlayingCard drawCardWithSuit(PlayingCard.Suit suit) {

        if(deck.isEmpty()) {
            this.reset();
        }

        PlayingCard playingCard = PlayingCardFactory.generatePlayingCardFromSuit(suit); //gets card based on param suit choice
        ArrayList<PlayingCard> removeCard = new ArrayList<PlayingCard>(); //list to add too when card is removed
        removeCard.add(playingCard); //adds to removed card list
        deck.removeAll(removeCard); //removes from play deck
        return playingCard; //returns the card
    }

    /**
     * Method to refresh the deck to its original 52 random cards.
     * @param
     */
    private void reset() {  //resets the deck once cards have been removed because of being drawn
        for (PlayingCard.Suit suit: PlayingCard.Suit.values()) {
            for(PlayingCard.CardFace cardFace: PlayingCard.CardFace.values()) {
                PlayingCard playingCard = new PlayingCard(cardFace, suit);
                deck.add(playingCard);
            }
        }
    }

    /**
     * Core methods to produce a collection of n card from the deck. Prints the string
     * and ascii art to console to show a random N collection of cards from a deck of
     * American playing cards.
     * @param numberOfCardsToBeAdded
     * @param hand
     * @return displays card values to console with string and ascii art.
     */
    public ArrayList<PlayingCard> drawHand(int numberOfCardsToBeAdded,ArrayList<PlayingCard> hand) {
        if(!hand.isEmpty()) {
            hand.clear();
        }
        if(deck.isEmpty()) {
            this.reset();
        }
        ArrayList<PlayingCard> toRemove = new ArrayList<PlayingCard>(); //cards to be removed
        for(int i = 0; i < numberOfCardsToBeAdded; i++) {  //i is less than parameter choice of number of cards
            PlayingCard playingCard = PlayingCardFactory.generatePlayingCard(); //generated random card
            for(PlayingCard playingCard1: deck) {  //for playing card in the play deck
                if(playingCard1.getSuit() == playingCard.getSuit() && //if the card suit & value in the deck == generated card value & suit
                        playingCard1.getFaceValue() == playingCard.getFaceValue()) {
                    hand.add(playingCard); //add generated card to the hand
                    toRemove.add(playingCard1); //add generated card to removing array list
                }
            }
        }
        deck.removeAll(toRemove); //remove all from the cards to be removed array
        return hand; //return hand
    }

    /**
     * Method to get deck size
     * @return deck
     */
    public int getSize() {
        return deck.size();
    }
}