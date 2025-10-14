package inheritance;

public class CheckingAccount extends Account {

    private String cardNo; // 직불카드 번호

    public CheckingAccount(String accountNo, String owner, long balance, String cardNo) {
        super(accountNo, owner, balance);
        this.cardNo = cardNo;
    }

    // 직불카드 사용액을 지불한다.
    long pay(String cardNo, long amount) throws Exception {
        // 카드번호 일치
        if (!this.cardNo.equals(cardNo)) {
            throw new Exception("카드번호 확인");
        }
        // 일치하다면 출금
        // 잔액 = 잔액 - 직불카드 사용액
        return withdraw(amount);
    }
}
