package object;

public class AccountEx {
    public static void main(String[] args) {
        // Account 인스턴스 생성
        Account account = new Account("120-12-111", "홍길동", 100000);

        // 입금한다 호출
        account.deposit(50000);
        // 입금 후 잔액
        // System.out.println("잔액 : " + account.balance);
        System.out.println("잔액 : " + account.getBalance());

        // 출금한다 호출
        long balance = account.withdraw(70000);
        System.out.println("잔액 : " + balance);

        Account account2 = new Account("121-11-2222", "성춘향", 150000);
        // 잔액조회
        // System.out.println("성춘향 잔액 : " + account2.getBalance());
        System.out.println("=========================");
        System.out.println("1. 계좌번호 : " + account2.getAccountNo());
        System.out.println("2. 계좌주 : " + account2.getOwner());
        System.out.println("3. 잔액 : " + account2.getBalance());
        System.out.println("=========================");
    }
}
