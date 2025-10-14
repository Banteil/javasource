package object;

public class DataEx {
    public static void main(String[] args) {
        // Data 인스턴스 생성
        Data data = new Data();
        data.x = 10;
        change(data.x); // 값
        System.out.println("change 호출 후 " + data.x);
        change(data);
        System.out.println("change(Data d) 호출 후 " + data.x);

        Data data2 = copy(data);
        System.out.println("data2.x = " + data2.x);
    }

    public static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;
        return tmp;
    }

    public static void change(Data d) {
        d.x = 15;
        System.out.println("변경 후 " + d.x);
    }

    public static void change(int x) {
        x = 15;
        System.out.println("변경 후 " + x);
    }
}
