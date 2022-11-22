public class CardDeck {
    public static void main(String[] args) {
        for (PlayingCard.Suit suit : PlayingCard.Suit.values()) {
            for (int j = 0; j <= 14; j++) {
                String playingCard = j + " of " + suit;
                System.out.println(playingCard);
            }
        }
    }
}
