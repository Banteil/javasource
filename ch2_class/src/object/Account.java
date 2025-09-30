package object;

public class Account {
    // 은행계좌
    // 계좌번호(120-12-111), 계좌주 (홍길동), 잔액(10000)
    String accountNo;
    String owner;
    long balance;

    Account() {
    }

    Account(String accountNo, String owner) {
        this.accountNo = accountNo;
        this.owner = owner;
    }

    Account(String accountNo, String owner, long balance) {
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getOwner() {
        return owner;
    }

    public long getBalance() {
        return balance;
    }

    // 입금한다(잔액 = 잔액 + 입금액), 출금한다(잔액 = 잔액 - 출금액)
    void deposit(long money) {
        this.balance += money;
    }

    long withdraw(long money) {
        if (this.balance > money) {
            this.balance -= money;
        } else {
            System.out.printf("잔액이 부족합니다. (현재 예금액 : %d)\n", balance);
        }

        return this.balance;
    }
}
