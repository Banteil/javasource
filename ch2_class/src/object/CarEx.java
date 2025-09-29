package object;

public class CarEx {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("기아");
        Car car3 = new Car("현대", "소나타");
        Car car4 = new Car("현대", "아이오닉5", "white");
        Car car5 = new Car("현대", "아반떼", "white", 200);
        // 멤버 변수에 직접 접근은 가능하면(x)

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
