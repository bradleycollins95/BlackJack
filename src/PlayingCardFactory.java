import java.util.Random;

public class PlayingCardFactory {

    /**
     * Random card generator
     * @return PlayingCard
     */
    public static PlayingCard generatePlayingCard(){
        Random random = new Random();
        int r = random.nextInt();

        if (r % 3 == 0){
            return new PlayingCard(r, PlayingCard.Suit.DIAMONDS);
        } else if (r % 3 == 2){
            return new PlayingCard(r, PlayingCard.Suit.HEARTS);
        } else {
            return new PlayingCard(r, PlayingCard.Suit.SPADES);
        }
    }

//    public static void main(String[] args) {
//        System.out.printf("%d", );
//    }
}
