package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop2 implements IShop {
    private final int MAX_CART_SIZE = 5;

    private String title;
    List<Product> products = new ArrayList<>();
    List<Product> carts = new ArrayList<>();
    List<User> users = new ArrayList<>();

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
        for (int i = 0; i < users.size(); i++) {
            System.out.printf("[%d]%s(%s)\n", i, users.get(i).getName(), users.get(i).getPayType().name());
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

            if (sel >= 0 && sel < users.size()) {
                System.out.printf("## %s 선택 ##\n", users.get(sel).getName());
                selectedUser = users.get(sel);
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
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("[%d]상품 이름 : %s\n가격 : %d\n", i, products.get(i).getName(), products.get(i).getPrice());
            products.get(i).printExtra();
        }
        System.out.printf("[h] 메인 화면\n[c] 체크 아웃\n[d] 장바구니 비우기\n");

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
                carts = new ArrayList<>();
                cartNum = 0;
                System.out.println("장바구니를 비웠습니다.");
                continue;
            } else {
                sel = Integer.parseInt(selChar);
                System.out.println(carts.size());
                if (sel >= 0 && sel < products.size()) {
                    if (cartNum >= MAX_CART_SIZE) {
                        System.out.println("더는 상품을 장바구니에 담을 수 없습니다.");
                        continue;
                    }

                    carts.add(cartNum, products.get(sel));
                    cartNum++;
                    System.out.printf("## %s 상품을 장바구니에 담았습니다. ##\n", products.get(sel).getName());
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
            System.out.printf("[%d]%s(%d)\n", i, carts.get(i).getName(), carts.get(i).getPrice());
            sum += carts.get(i).getPrice();
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
        users.add(new User("홍길동", PayType.CARD));
        users.add(new User("청길동", PayType.CASH));
    }

    // 상품 등록
    @Override
    public void genProduct() {
        products.add(new TV("삼성TV", 2300000, "4K"));
        products.add(new TV("LGTV", 5000000, "8K"));
        products.add(new CellPhone("갤럭시Z폴드", 1200000, "U+"));
        products.add(new CellPhone("갤럭시S25", 1500000, "KT"));
        products.add(new CellPhone("어른폰18", 10000000, "SKT"));
    }
}
