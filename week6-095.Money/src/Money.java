
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {

        int euros = this.euros + added.euros;
        int cents = this.cents + added.cents;

        Money addedMoney = new Money(euros, cents);

        return addedMoney;
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decremented) {
        int mCents = (this.euros * 100) + this.cents;
        int subCents = (decremented.euros * 100) + decremented.cents;
        int totalCents = mCents - subCents;

        int euros = totalCents / 100;
        int cents = totalCents % 100;

        Money change = new Money(euros, cents);

        if (totalCents < 0) {
            change = new Money(0, 0);
        }

        return change;
    }
}
