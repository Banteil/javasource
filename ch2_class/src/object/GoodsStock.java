package object;

public class GoodsStock {
    // 속성 : 상품명(p0001), 수량(10)
    String name;
    int amount;

    public GoodsStock(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    // 기본생성자
    public GoodsStock() {
    }

    // setter, getter 메소드
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "GoodsStock [name=" + name + ", amount=" + amount + "]";
    }

}
