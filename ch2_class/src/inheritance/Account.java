package inheritance;

import java.util.Scanner;

// private : 해당 클래스내에서만 접근 가능
public class Account {
    // 은행계좌
    // 계좌번호(120-12-111), 계좌주(홍길동), 잔액(100000)
    private String accountNo;
    private String owner;
    private long balance;
    Scanner sc = new Scanner(System.in);

    public Account(String accountNo) {
        this.accountNo = accountNo;
    }

    public Account(String accountNo, String owner) {
        // this.accountNo = accountNo;
        this(accountNo);
        this.owner = owner;
    }

    public Account(String accountNo, String owner, long balance) {
        // this.accountNo = accountNo;
        // this.owner = owner;
        this(accountNo, owner);
        this.balance = balance;
    }

    // 입금한다(잔액 = 잔액 + 입금액)
    void deposit(long amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // 출금한다.(잔액 = 잔액 - 출금액)
    long withdraw(long amount) throws Exception {
        // 잔액 안에서 출금허용
        if (amount > balance) {
            throw new Exception("잔액 부족");
        }
        balance -= amount;
        return balance;
    }

    // 속성 값 조회 : get~~~
    public long getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [accountNo=" + accountNo + ", owner=" + owner + ", balance=" + balance + "]";
    }

}
