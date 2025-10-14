package object;

public class AccountEx2 {
    public static void main(String[] args) {
        // Account account = new Account(null, null, 0);
        // Account account2 = new Account(null, null, 0);
        // Account account3 = new Account(null, null, 0);

        Account[] accounts = new Account[3];

        accounts[0] = new Account("111", "홍길동", 10000);
        accounts[1] = new Account("222", "성춘향", 20000);
        accounts[2] = new Account("333", "이순신", 30000);

        print(accounts);

        // 성춘향 계좌에 입금
        accounts[1].deposit(100000);
        System.out.println(accounts[1].getOwner() + " : " + accounts[1].getBalance());
    }

    static void print(Account[] accounts) {
        for (Account account : accounts) {
            System.out.println("=========================");
            System.out.println("1. 계좌번호 : " + account.getAccountNo());
            System.out.println("2. 계좌주 : " + account.getOwner());
            System.out.println("3. 잔액 : " + account.getBalance());
        }
    }
}
