package shop;

import java.util.Scanner;

public class MyShop implements IShop {
    private String title;
    Product[] products = new Product[5];
    Product[] carts = new Product[5];
    User[] users = new User[2];

    private User selectedUser;
    private int cartNum = 0;
    private Scanner sc = new Scanner(System.in);

    public void setTitle(String title) {
        this.title = title;
    }

    // 메뉴
    @Override
    public void start() {
        int sel = -1;
        System.out.printf("%s : 메인 화면 - 계정 선택\n", title);
        System.out.println("=======================");
        for (int i = 0; i < users.length; i++) {
            System.out.printf("[%d]%s(%s)\n", i, users[i].getName(), users[i].getPayType().name());
        }
        System.out.printf("[x]종료\n");

        do {
            System.out.print("선택 : ");
            var selChar = sc.nextLine();
            if (selChar.equals("x")) {
                sc.close();
                return;
            }
            sel = Integer.parseInt(selChar);

            if (sel >= 0 && sel < users.length) {
                System.out.printf("## %s 선택 ##\n", users[sel].getName());
                selectedUser = users[sel];
                productList();
                break;
            } else
                continue;
        } while (true);
    }

    // 상품 출력
    @Override
    public void productList() {
        int sel = -1;
        System.out.printf("%s : 상품 목록 - 상품 선택\n", title);
        System.out.println("=======================");
        for (int i = 0; i < products.length; i++) {
            System.out.printf("[%d]상품 이름 : %s\n가격 : %d\n", i, products[i].getName(), products[i].getPrice());
            products[i].printExtra();
        }
        System.out.printf("[h] 메인 화면\n[c] 체크 아웃\n[d] 장바구니 비우기");

        do {
            System.out.print("선택 : ");
            var selChar = sc.nextLine();
            if (selChar.equals("h")) {
                selectedUser = null;
                start();
                break;
            } else if (selChar.equals("c")) {
                if (cartNum < 1) {
                    System.out.println("장바구니에 물품이 없습니다.");
                    continue;
                }
                checkOut();
                break;
            } else if (selChar.equals("d")) {
                carts = new Product[5];
                cartNum = 0;
                System.out.println("장바구니를 비웠습니다.");
                continue;
            } else {
                sel = Integer.parseInt(selChar);

                if (sel >= 0 && sel < products.length) {
                    if (cartNum >= carts.length) {
                        System.out.println("더는 상품을 장바구니에 담을 수 없습니다.");
                        continue;
                    }

                    carts[cartNum] = products[sel];
                    cartNum++;
                    System.out.printf("## %s 상품을 장바구니에 담았습니다. ##\n", products[sel].getName());
                    System.out.printf("## 현재 장바구니 물품 개수 : %d개 ##\n", cartNum);
                    continue;
                } else
                    continue;
            }
        } while (true);
    }

    // 결제처리
    @Override
    public void checkOut() {
        int sum = 0;
        System.out.printf("%s : 체크아웃\n", title);
        System.out.println("===================================");
        for (int i = 0; i < cartNum; i++) {
            System.out.printf("[%d]%s(%d)\n", i, carts[i].getName(), carts[i].getPrice());
            sum += carts[i].getPrice();
        }
        System.out.println("===================================");
        System.out.printf("결제 방법: %s\n", selectedUser.getPayType().name());
        System.out.printf("합계 : %d 원 입니다\n", sum);
        System.out.printf("[p] 이전, [q] 결제 완료\n");

        do {
            System.out.print("선택 : ");
            var selChar = sc.nextLine();
            if (selChar.equals("p")) {
                productList();
                break;
            } else if (selChar.equals("q")) {
                System.out.println("## 결제가 완료되었습니다. 종료합니다. ##");
                sc.close();
                return;
            }
        } while (true);
    }

    // 사용자 등록
    @Override
    public void genUser() {
        users[0] = new User("홍길동", PayType.CARD);
        users[1] = new User("청길동", PayType.CASH);
    }

    // 상품 등록
    @Override
    public void genProduct() {
        products[0] = new TV("삼성TV", 2300000, "4K");
        products[1] = new TV("LGTV", 5000000, "8K");
        products[2] = new CellPhone("갤럭시Z폴드", 1200000, "U+");
        products[3] = new CellPhone("갤럭시S25", 1500000, "KT");
        products[4] = new CellPhone("어른폰18", 10000000, "SKT");
    }
}
