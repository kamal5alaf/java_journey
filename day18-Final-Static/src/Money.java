import java.lang.classfile.ClassTransform;
import java.util.Objects;

public final class Money {
    private final double money;
    private final String currency;

    private Money(double money, String currency) {
        this.money = money;
        this.currency = currency;
    }


    public static Money of(double money, String currency) {
        if (money < 0 || currency.isBlank()) {
            throw new IllegalArgumentException("not allowed less than 0");
        }
        Money m = new Money(money, currency);
        return m;
    }


    public Money add(Money other) {
        if (!other.currency.equals(this.currency)) throw new IllegalArgumentException("Currencies must match");
        Money result = Money.of(this.money + other.money, this.currency);
        return result;
    }

    public Money sub(Money other) {
        if (!(other.currency.equals(this.currency)) || other.money < 0)
            throw new IllegalArgumentException("not allowed");
        if (this.money < other.money) throw new IllegalArgumentException("not allowed");
        Money result = Money.of(this.money - other.money, this.currency);
        return result;

    }

    public Money multi(double factor) {
        if (factor < 0) throw new IllegalArgumentException("not allowed");
        Money result = Money.of(money * factor, this.currency);
        return result;
    }

    @Override
    public String toString() {
        return currency + " " + money;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Money)) return false;
        Money money = (Money) obj;
        return this.money == money.money && this.currency.equals(money.currency);
    }


    @Override
    public int hashCode() {
        return Objects.hash(currency, money);
    }
}
