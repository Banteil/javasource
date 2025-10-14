package object;

public class GoodsEx {
    public static void main(String[] args) {
        GoodsStock goodsStock = new GoodsStock("p-001", 35);
        GoodsStock goodsStock1 = new GoodsStock();
        goodsStock1.setName("p-002");
        goodsStock1.setAmount(40);

        System.out.println(goodsStock);
        System.out.println(goodsStock1);
    }
}
