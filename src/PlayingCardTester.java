import java.util.ArrayList;

public class PlayingCardTester {

    public static void main(String[] args) {
        System.out.println("Fun with Playing Cards");

        ArrayList<PlayingCard> cardArrayList = new ArrayList<>();

        cardArrayList.add(PlayingCardFactory.generatePlayingCard());
        cardArrayList.add(PlayingCardFactory.generatePlayingCard());
        cardArrayList.add(PlayingCardFactory.generatePlayingCard());

        printPlayingCards(cardArrayList);

    }

    public static void printPlayingCards(ArrayList<PlayingCard> cardArrayList){
        for (PlayingCard playingCard: cardArrayList){
            System.out.printf("\n%s", playingCard.toString());
        }
    }

}
