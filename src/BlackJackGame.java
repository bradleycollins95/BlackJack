import java.util.ArrayList;

/**
 * Class that defines a Player and Dealer in the console application
 * Values include their name, hand (by adding cards)
 *
 * @author 20108508
 */
class BlackJackGame {

    private String name;
    private ArrayList<PlayingCard> hand;
    private int balance;

    /**
     * Constructor that defines the Player's name and hand
     *
     * @param name    the name of the player
     * @param balance the player's balance ($)
     */
    public void Player(String name, int balance) {
        this.name = name;
        this.balance = balance;
        this.hand = new ArrayList<>();
    }

    /**
     * Grabs the user's name in the console
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the Player's balance
     * @return balance
     */
    public int getBalance(){
        return balance;
    }

    /**
     * Removes the top card from the deck ArrayList and adds it to the user's hand
     */
    public void addCard(PlayingCard card) {
        hand.add(card);
    }

    /**
     * Adds the total face values of the cards in the player's hand
     * @return handSum
     */
    public int getHandSum() {
        int handSum = 0;
        for (PlayingCard card : hand) {
            handSum += card.faceValue();
        }
        return handSum;
    }

    /**
     * If the hand is the player's, show the 2 dealt cards and every card drawn
     * If the hand is the dealer's, show 1 card, and hide the other. Show the drawn cards.
     * @param hideCard hides the dealer's initial card
     * @return sb
     */
    public String getHandAsString(boolean hideCard) {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("'s current hand:"); //add to entered name's display when hand is dealt/added to
        sb.append('\n');
        for (int i = 0; i < hand.size(); i++) {
            //if the hand size is 0 for the dealer, hide the first drawn card added to their hand
            if (i == 0 && hideCard) {
                sb.append("[Hidden card]");
                sb.append('\n');
            } else {
                sb.append(hand.get(i));
                sb.append('\n');
            }
        }
        return sb.toString(); //return the card
    }

}