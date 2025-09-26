package control;

//continue : 반복문 내에서만 사용
//           반복이 진행되는 도중에 continue 문을 만나면 반복문의 끝으로 이동하여 다음 반복으로 넘어감
public class ContinueEx1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if ((i + 1) % 3 == 0)
                continue;
            else
                System.out.println(i + 1);
        }
    }
}
