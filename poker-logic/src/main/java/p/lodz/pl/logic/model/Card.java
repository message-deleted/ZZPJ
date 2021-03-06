package p.lodz.pl.logic.model;


import org.jetbrains.annotations.NotNull;
import p.lodz.pl.logic.comparators.RankComparator;

import java.util.Objects;

public record Card(Ranks rank, Suits suit) implements Comparable<Card> {

    @Override
    public Ranks rank() {
        return rank;
    }

    @Override
    public Suits suit() {
        return suit;
    }

    @Override
    public String toString() {
        return "\nCard: " + rank + " of " + suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank && suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    @Override
    public int compareTo(@NotNull Card o) {
        RankComparator rankComparator = new RankComparator();
        return rankComparator.compare(this, o);
    }
    
    
}
