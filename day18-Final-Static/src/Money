import java.lang.classfile.ClassTransform;

public final class Money {
    double money;
    String currency;

    public Money(double money, String currency) {
        if (money < 0 && currency.isBlank()) {
            throw new IllegalArgumentException("not allowed less than 0");
        }
        this.currency = currency;
        this.money = money;
    }

    public void add(Money other) {
        if (!other.currency.equals(this.currency)) throw new IllegalArgumentException("Currencies must match");
        this.money += other.money;
    }

    public void sub(Money other) {
        if (!(other.currency.equals(this.currency)) || other.money < 0) throw new IllegalArgumentException("not allowed");
        if (this.money < other.money ) throw new IllegalArgumentException("not allowed");
        this.money -= other.money;
    }

    public void multi(double factor) {
        if (factor < 0)throw new IllegalArgumentException("not allowed");
        this.money *= factor ;
    }

    @Override
    public String toString() {
        return currency+ " " + money;
    }
}
