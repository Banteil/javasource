package lang;

public class AccountEx {
    public static void main(String[] args) throws BalanceInsufficientException {
        Account account = new Account("111", "null", 0);

        try {
            account.withdraw(100);
        } catch (BalanceInsufficientException e) {
            e.printStackTrace();
            // System.out.println(e.getMessage());
        }

    }
}
