package object;

public class AccountEx {
    public static void main(String[] args) {
        Account myAccount = new Account("120-12-111", "홍길동", 10000);
        System.out.println(myAccount.getOwner() + " 계좌번호 : " + myAccount.getAccountNo());
        System.out.println(myAccount.getOwner() + " 현재 잔액 : " + myAccount.getBalance());
        myAccount.deposit(30000);
        System.out.println(myAccount.getOwner() + " 입금 후 잔액 : " + myAccount.getBalance());
        System.out.println(myAccount.getOwner() + " 출금 후 잔액 : " + myAccount.withdraw(1000));

        Account myAccount2 = new Account("120-12-222", "성춘향");
        System.out.println(myAccount2.getOwner() + " 계좌번호 : " + myAccount2.getAccountNo());
        System.out.println(myAccount2.getOwner() + " 현재 잔액 : " + myAccount2.getBalance());
        myAccount2.deposit(150000);
        System.out.println(myAccount2.getOwner() + " 입금 후 잔액 : " + myAccount2.getBalance());
        System.out.println(myAccount2.getOwner() + " 출금 후 잔액 : " + myAccount2.withdraw(10000));
    }
}
