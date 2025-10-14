package inheritance;

public class BonusPointAccount extends Account {
    // 보너스포인트 적립
    private int bonusPoint;

    public BonusPointAccount(String accountNo, String owner, long balance, int bonusPoint) {
        super(accountNo, owner, balance);
        this.bonusPoint = bonusPoint;
    }

    // 예금 + 보너스포인트 적립
    @Override
    void deposit(long amount) {
        // 예금한다(부모꺼 호출)
        super.deposit(amount);
        // 보너스포인트 적립 : 예금액의 1 %
        int point = (int) (amount * 0.01);
        bonusPoint += point;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

}
