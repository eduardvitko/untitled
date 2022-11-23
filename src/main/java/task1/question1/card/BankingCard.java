package task1.question1.card;

import java.util.Objects;

public class BankingCard extends Card {
private String name_Bank;
private String type_Card;
private String CVV_Code;
private  double balance;

    public BankingCard() {

    }

    public BankingCard(String name_Bank, String type_Card, String CVV_Code, double balance) {
        this.name_Bank = name_Bank;
        this.type_Card = type_Card;
        this.CVV_Code = CVV_Code;
        this.balance = balance;
    }

    public String getName_Bank() {
        return name_Bank;
    }

    public void setName_Bank(String name_Bank) {
        this.name_Bank = name_Bank;
    }

    public String getType_Card() {
        return type_Card;
    }

    public void setType_Card(String type_Card) {
        this.type_Card = type_Card;
    }

    public String getCVV_Code() {
        return CVV_Code;
    }

    public void setCVV_Code(String CVV_Code) {
        this.CVV_Code = CVV_Code;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public  double chekBalance(){
        return getBalance();
    }

    @Override
    public String toString() {
        return "BankingCard{" +
                "name_Bank='" + name_Bank + '\'' +
                ", type_Card='" + type_Card + '\'' +
                ", CVV_Code='" + CVV_Code + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BankingCard that = (BankingCard) o;
        return Double.compare(that.balance, balance) == 0 && Objects.equals(name_Bank, that.name_Bank) && Objects.equals(type_Card, that.type_Card) && Objects.equals(CVV_Code, that.CVV_Code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name_Bank, type_Card, CVV_Code, balance);
    }
}
