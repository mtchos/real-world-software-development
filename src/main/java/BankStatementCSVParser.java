import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BankStatementCSVParser {
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static List<BankTransaction> getTransactions(List<String> lines) {
        List<BankTransaction> transactions = new java.util.ArrayList<>(List.of());
        for (String line : lines) {
            transactions.add(getTransaction(line));
        }
        return transactions;
    }

    private static BankTransaction getTransaction(String line) {
        String[] entries = line.split(",");
        LocalDate date = LocalDate.parse(entries[0], DATE_FORMATTER);
        double amount = Double.parseDouble(entries[1]);
        String description = entries[2];
        return new BankTransaction(date, amount, description);
    }
}

