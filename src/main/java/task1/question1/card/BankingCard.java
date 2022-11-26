package task1.question1.card;

import java.time.LocalDate;
import java.util.Objects;

public class BankingCard extends Card {
private String nameBank;
private String typeCard;
private String CVVCode;
private  double balance;

    public BankingCard() {

    }

    public BankingCard(String nameBank, String typeCard, String CVVCode, double balance, String number, LocalDate dateExp) {
        super(number,dateExp);
        this.nameBank = nameBank;
        this.typeCard = typeCard;
        this.CVVCode = CVVCode;
        this.balance = balance;
    }



    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String name_Bank) {
        this.nameBank = name_Bank;
    }

    public String getTypeCard() {
        return typeCard;
    }

    public void setTypeCard(String type_Card) {
        this.typeCard = type_Card;
    }

    public String getCVVCode() {
        return CVVCode;
    }

    public void setCVVCode(String CVV_Code) {
        this.CVVCode = CVV_Code;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public  double checkBalance(){
        return getBalance();
    }

    @Override
    public String toString() {
        return "BankingCard{" +
                "name_Bank='" + nameBank + '\'' +
                ", type_Card='" + typeCard + '\'' +
                ", CVV_Code='" + CVVCode + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BankingCard that = (BankingCard) o;
        return Double.compare(that.balance, balance) == 0 && Objects.equals(nameBank, that.nameBank) && Objects.equals(typeCard, that.typeCard) && Objects.equals(CVVCode, that.CVVCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameBank, typeCard, CVVCode, balance);
    }
}
