import java.time.LocalDate;
import java.util.Objects;

public class BankTransaction {

    private LocalDate date;

    private double amount;

    private String description;

    public BankTransaction(LocalDate date, double amount, String description) {
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    public String toString() {
        return "Bank transaction: " + this.description
                + ", at " + this.date
                + ", of " + this.amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankTransaction that)) return false;
        return Double.compare(amount, that.amount) == 0 && Objects.equals(date, that.date) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, amount, description);
    }
}
