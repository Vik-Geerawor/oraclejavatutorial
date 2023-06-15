package i_javalanguage.iii_classesandobjects;

// https://en.wikipedia.org/wiki/Standard_52-card_deck

public class Deck {
    private Card cards[][] = new Card[4][13];       //TODO: does not create card objects

    public Deck() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cards[i][j] = new Card();           //TODO: so we have to create them
            }
        }

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    setSuit(cards[i], SuitEnum.CLUBS);
                    break;
                case 1:
                    setSuit(cards[i], SuitEnum.DIAMONDS);
                    break;
                case 2:
                    setSuit(cards[i], SuitEnum.HEARTS);
                    break;
                case 3:
                    setSuit(cards[i], SuitEnum.SPADES);
                    break;
            }
        }
    }

    private void setSuit(Card c[], SuitEnum s) {
        for (int i = 0; i < 13; i++) {
            c[i].setSuit(s);
            switch (i) {
                case 0:
                    c[i].setRank(RankEnum.ACE);
                    break;
                case 1:
                    c[i].setRank(RankEnum.ONE);
                    break;
                case 2:
                    c[i].setRank(RankEnum.TWO);
                    break;
                case 3:
                    c[i].setRank(RankEnum.THREE);
                    break;
                case 4:
                    c[i].setRank(RankEnum.FOUR);
                    break;
                case 5:
                    c[i].setRank(RankEnum.FIVE);
                    break;
                case 6:
                    c[i].setRank(RankEnum.SIX);
                    break;
                case 7:
                    c[i].setRank(RankEnum.SEVEN);
                    break;
                case 8:
                    c[i].setRank(RankEnum.EIGHT);
                    break;
                case 9:
                    c[i].setRank(RankEnum.NINE);
                    break;
                case 10:
                    c[i].setRank(RankEnum.JACK);
                    break;
                case 11:
                    c[i].setRank(RankEnum.QUEEN);
                    break;
                case 12:
                    c[i].setRank(RankEnum.KING);
                    break;
            }
        }
    }

    private void showDeck() {
        for (int i = 0; i < 4; i++) {
            System.out.print(cards[i][0].getSuit() + ": ");
            for (int j = 0; j < 13; j++) {
//                System.out.print(cards[i][j].getSuit() + ":" + cards[i][j].getRank() + " ");
                System.out.print(cards[i][j].getRank() + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Deck d = new Deck();
        d.showDeck();
    }
}
