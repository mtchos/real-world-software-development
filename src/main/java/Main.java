import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    private static final String RESOURCES = "src/main/resources/";

    public static void main(String[] args) throws IOException {
        final Path path = Paths.get(RESOURCES + args[0]);
        List<String> lines = Files.readAllLines(path);
        List<BankTransaction> transactions = BankStatementCSVParser.getTransactions(lines);
        System.out.println(transactions);
    }
}
