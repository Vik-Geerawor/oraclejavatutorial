package i_javalanguage.iii_classesandobjects;

public class Card {
    RankEnum rank;
    SuitEnum suit;

    public void Card(RankEnum rank, SuitEnum suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank.name();
    }

    public String getSuit() {
        return suit.name();
    }

    public void setRank(RankEnum rank) {
        this.rank = rank;
    }

    public void setSuit(SuitEnum suit) {
        this.suit = suit;
    }

    public void showAllCards() {
        for (SuitEnum s : SuitEnum.values()) {
            System.out.print(s.name() + ": ");
            for (RankEnum r: RankEnum.values()) {
                System.out.print(r.name() + " ");
            }
            System.out.println();
        }
    }
}
