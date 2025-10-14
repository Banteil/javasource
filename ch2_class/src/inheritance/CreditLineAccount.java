package inheritance;

public class CreditLineAccount extends Account {

    // 마이너스 한도
    private int creditLine;

    public CreditLineAccount(String accountNo, String owner, long balance, int creditLine) {
        super(accountNo, owner, balance);
        this.creditLine = creditLine;
    }

    // 출금 : 잔액(잔액 + 마이너스한도) - 사용액
    @Override
    long withdraw(long amount) throws Exception {

        if (super.getBalance() + creditLine < amount) {
            throw new Exception("마이너스 한도 확인");
        }

        // 잔액(잔액 + 마이너스한도) - 사용액
        // balance = (balance + creditLine) - amount;
        setBalance(getBalance() - amount);
        return super.getBalance();
    }

}
