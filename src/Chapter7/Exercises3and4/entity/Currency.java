package Chapter7.Exercises3and4.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CurrencyConvert")
public class Currency {

    @Id
    private String currency;
    @Column(name="rate")
    private double rate;

    public Currency(String currency, double rate) {
        this.currency = currency;
        this.rate = rate;
    }
    public Currency() {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
