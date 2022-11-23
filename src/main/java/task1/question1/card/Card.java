package task1.question1.card;

import java.time.LocalDate;
import java.util.Objects;


public class Card {
    private String number;
    private LocalDate date_exp;


    public Card() {
    }

    public Card(String number, String CVV_Code, LocalDate date_exp) {
        this.number = number;
        this.date_exp = date_exp;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getDate_exp() {
        return date_exp;
    }

    public void setDate_exp(LocalDate date_exp) {
        this.date_exp = date_exp;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number='" + number + '\'' +
                ", date_exp=" + date_exp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(number, card.number) && Objects.equals(date_exp, card.date_exp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, date_exp);
    }
}
