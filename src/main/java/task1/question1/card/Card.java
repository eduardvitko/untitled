package task1.question1.card;

import java.time.LocalDate;
import java.util.Objects;


public class Card {
    private String number;
    private LocalDate dateExp;


    public Card() {
    }

    public Card(String number,LocalDate dateExp) {
        this.number = number;
        this.dateExp = dateExp;

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getDateExp() {
        return dateExp;
    }

    public void setDateExp(LocalDate date_exp) {
        this.dateExp = date_exp;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number='" + number + '\'' +
                ", date_exp=" + dateExp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(number, card.number) && Objects.equals(dateExp, card.dateExp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, dateExp);
    }
}
