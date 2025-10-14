package shop;

public class ShopEx {
    public static void main(String[] args) {
        // TV tv = new TV("삼성TV", 2300000, "4K");
        // CellPhone cellPhone = new CellPhone("갤럭시Z폴드", 1200000, "U+");

        // TV[] tvs = new TV[3];
        // tvs[0] = new TV("삼성TV", 2300000, "4K");
        // tvs[1] = new TV("삼성TV", 2300000, "4K");
        // tvs[2] = new TV("삼성TV", 2300000, "4K");

        // CellPhone[] cellPhones = new CellPhone[3];
        // cellPhones[0] = new CellPhone("갤럭시Z폴드", 1200000, "U+");
        // cellPhones[1] = new CellPhone("갤럭시Z폴드", 1200000, "U+");
        // cellPhones[2] = new CellPhone("갤럭시Z폴드", 1200000, "U+");

        // Product[] products = new Product[5];
        // products[0] = new TV("삼성TV", 2300000, "4K");
        // products[1] = new TV("LGTV", 5000000, "8K");0
        // products[2] = new CellPhone("갤럭시Z폴드", 1200000, "U+");
        // products[3] = new CellPhone("갤럭시S25", 1500000, "KT");
        // products[4] = new CellPhone("어른폰18", 10000000, "SKT");

        // for (int i = 0; i < products.length; i++) {
        // products[i].printDetail();
        // }

        // User user = new User("홍길동", PayType.CARD);

        MyShop myShop = new MyShop();
        myShop.setTitle("내 가게");
        myShop.genUser();
        myShop.genProduct();
        myShop.start();
    }
}
