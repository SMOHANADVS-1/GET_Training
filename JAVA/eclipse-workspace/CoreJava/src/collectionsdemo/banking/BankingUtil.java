package collectionsdemo.banking;
//utility class with generic method
public class BankingUtil {

	// Generic method to print any type of transaction
    public static <T> void printTransaction(T transaction) {
        System.out.println("Transaction: " + transaction);
    }

}
