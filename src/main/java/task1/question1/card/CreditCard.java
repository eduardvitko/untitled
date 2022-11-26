package task1.question1.card;

import java.time.LocalDate;
import java.util.Objects;

public class CreditCard  extends BankingCard {

    private double totalBalance;
    private double balanceOfCredit;
    private double balanceOwnFunds;
    private double limitOfCredit;
    private double interestRate;

    public CreditCard() {

    }

    public CreditCard(String nameBank, String typeCard, String CVVCode, double balance, String number, LocalDate dateExp, double totalBalance, double balanceOfCredit, double balanceOwnFunds, double limitOfCredit, double interestRate) {
        super(nameBank, typeCard, CVVCode, balance, number, dateExp);
        this.totalBalance = totalBalance;
        this.balanceOfCredit = balanceOfCredit;
        this.balanceOwnFunds = balanceOwnFunds;
        this.limitOfCredit = limitOfCredit;
        this.interestRate = interestRate;
    }

    public double addBalance(int money){
        return totalBalance;
    }
    public double withDrawMoney(int money){
        return totalBalance;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public double getBalanceOfCredit() {
        return balanceOfCredit;
    }

    public void setBalanceOfCredit(double balanceOfCredit) {
        this.balanceOfCredit = balanceOfCredit;
    }

    public double getBalanceOwnFunds() {
        return balanceOwnFunds;
    }

    public void setBalanceOwnFunds(double balanceOwnFunds) {
        this.balanceOwnFunds = balanceOwnFunds;
    }

    public double getLimitOfCredit() {
        return limitOfCredit;
    }

    public void setLimitOfCredit(double limitOfCredit) {
        this.limitOfCredit = limitOfCredit;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "totalBalance=" + totalBalance +
                ", balanceOfCredit=" + balanceOfCredit +
                ", balanceOwnFunds=" + balanceOwnFunds +
                ", limitOfCredit=" + limitOfCredit +
                ", interestRate=" + interestRate +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CreditCard that = (CreditCard) o;
        return Double.compare(that.totalBalance, totalBalance) == 0 && Double.compare(that.balanceOfCredit, balanceOfCredit) == 0 && Double.compare(that.balanceOwnFunds, balanceOwnFunds) == 0 && Double.compare(that.limitOfCredit, limitOfCredit) == 0 && Double.compare(that.interestRate, interestRate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), totalBalance, balanceOfCredit, balanceOwnFunds, limitOfCredit, interestRate);
    }
}
