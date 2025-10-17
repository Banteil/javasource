package util;

public class BoxEx1 {
    public static void main(String[] args) {
        Box1 box1 = new Box1();
        box1.setItem("홍길동"); // new String("홍길동")
        var name = (String) box1.getItem();
        System.out.println(name);

        box1.setItem(123); // Integer.valueOf(123)
        var i = (Integer) box1.getItem();
        System.out.println(i);

        box1.setItem(33.33); // Double.valueOf(33.33)
        var d = (Double) box1.getItem();
        System.out.println(d);

        Box2<String> box2 = new Box2<>();
        box2.setItem("홍길동"); // new String("홍길동")
        System.out.println(box2.getItem());

        Box2<Integer> box3 = new Box2<>();
        box3.setItem(123); // Integer.valueOf(123)
        System.out.println(box3.getItem());
    }
}
