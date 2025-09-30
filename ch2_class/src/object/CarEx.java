package object;

public class CarEx {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("기아");
        Car car3 = new Car("현대", "소나타");
        Car car4 = new Car("현대", "아이오닉5", "white");
        Car car5 = new Car("현대", "아반떼", "white", 200);
        // 멤버 변수에 직접 접근은 가능하면(x)

        println(car1);
        println(car2);
        println(car3);
        println(car4);
        println(car5);
    }

    public static void println(Car car) {
        System.out.println("------------------------");
        System.out.println("제조회사 : " + car.getCompanyName());
        System.out.println("모델명 : " + car.getModel());
        System.out.println("색상 : " + car.getColor());
        System.out.println("최고속도 : " + car.getMaxSpeed());
        System.out.println("------------------------");
    }
}
