import java.util.*;

public class PlayingCardTester {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        applicationMenu();
    }

    /**
     * Main console for running application
     * @param input
     */
    public static void applicationMenu() {
        System.out.println("Welcome To Playing Cards");
        CardDeck cardDeck = new CardDeck();
        ArrayList<PlayingCard> hand = new ArrayList<PlayingCard>();
        char choice = '0'; //decider for choice
        do {
            printInstructions();
            choice = scanner.nextLine().charAt(0);
            if (choice == '0') {
                //ends the menu
                System.out.println("Thanks For Playing");
                System.exit(0);}

            if (choice == '1') {
                System.out.println("1- Pick A Random Card.");
                System.out.println("2- Pick A Random Card Given Suit.");
                char cardChoice = scanner.nextLine().charAt(0);
                if(cardChoice == '1') { //prints a random card in the deck
                    PlayingCard playingCard = cardDeck.drawCard();
                    System.out.println(playingCard); //prints out random card
                }
                else if (cardChoice == '2') {
                    System.out.println("1-Spades\n2-Hearts\n3-Diamonds\n4-Clubs");
                    char suitChoice = scanner.nextLine().charAt(0);
                    //if suit is 1 print spades
                    if(suitChoice == '1') {
                        PlayingCard playingCard = cardDeck.drawCardWithSuit(PlayingCard.Suit.SPADES);
                        System.out.println(playingCard);
                    }
                    //if suit is 2 print hearts
                    else if(suitChoice == '2') {
                        PlayingCard playingCard = cardDeck.drawCardWithSuit(PlayingCard.Suit.HEARTS);
                        System.out.println(playingCard);
                    }
                    //if suit is 3 print diamonds
                    else if(suitChoice == '3') {
                        PlayingCard playingCard = cardDeck.drawCardWithSuit(PlayingCard.Suit.DIAMONDS);
                        System.out.println(playingCard);
                    }
                    //if suit is 4 print clubs
                    else if(suitChoice == '4') {
                        PlayingCard playingCard = cardDeck.drawCardWithSuit(PlayingCard.Suit.CLUBS);
                        System.out.println(playingCard);
                    }
                    else {
                        System.out.println("Invalid Choice");
                    }
                }
                else {
                    System.out.println("Invalid Choice");
                }
                break;
            }
            if (choice == '2') {
                System.out.println("Please Enter The Numbers Of Cards You Want To Draw For Hand: ");
                int numberOfCards = scanner.nextInt(); //user input
                if(numberOfCards > 52 || numberOfCards > cardDeck.getSize()) {
                    System.out.println("Invalid Number Of Cards");
                    scanner.nextLine();
                }
                else {
                    hand = cardDeck.drawHand(numberOfCards, hand);
                    scanner.nextLine();
                    for (PlayingCard playingCard : hand) {
                        System.out.println(playingCard);
                    }
                }
                break;
            }
            if (choice == '3') {
                cardDeck.printDeck(); //prints deck
                break;
            }
            if (choice == '4') {
                cardDeck.shuffleDeck(); //shuffles deck
                System.out.println("Deck shuffled.");
                break;
            }

        } while (choice != '0');
    }
    public static void printInstructions() {
        System.out.println("\n0- To Exit");
        System.out.println("1- To Draw A Card.");
        System.out.println("2- Draw A Hand.");
        System.out.println("3- Print The Deck.");
        System.out.println("4- Shuffle The Deck.");
    }
}