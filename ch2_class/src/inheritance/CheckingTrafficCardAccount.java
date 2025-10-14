package inheritance;

public class CheckingTrafficCardAccount extends CheckingAccount {

    private boolean hasTrafficCard;

    public CheckingTrafficCardAccount(String accountNo, String owner, long balance, String cardNo,
            boolean hasTrafficCard) {
        super(accountNo, owner, balance, cardNo);
        this.hasTrafficCard = hasTrafficCard;
    }

    // 교통비 지급
    // 카드번호, 교통비 사용액을 인자로 받아서 카드번호가 일치하고 교통카드기능이 존재하면 지급
    // 교통카드 기능이 없는 경우 메세지로 알려주기
    long payTrafficCard(String cardNo, long amount) throws Exception {
        // 교통카드 기능 여부
        if (!hasTrafficCard) {
            throw new Exception("교통카드 기능이 없습니다.");
        }
        // 부모의 pay() 호출
        return pay(cardNo, amount);
    }

}
