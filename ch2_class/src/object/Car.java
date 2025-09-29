package object;

public class Car {
    // 속성 : 제조사명, 모델명, 색상, 최대속도
    String companyName;
    String model;
    String color;
    int maxSpeed;

    public Car() {
        System.out.println("초기화 하지 않고 차 생성!");
    }

    public Car(String companyName) {
        this.companyName = companyName;
        System.out.println("차 생성!");
    }

    public Car(String companyName, String model) {
        this.companyName = companyName;
        this.model = model;
        System.out.println("차 생성!");
    }

    public Car(String companyName, String model, String color) {
        this.companyName = companyName;
        this.model = model;
        this.color = color;
        System.out.println("차 생성!");
    }

    public Car(String companyName, String model, String color, int maxSpeed) {
        this.companyName = companyName;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        System.out.println("차 생성!");
    }

    void forward() {
        System.out.println(this.model + " 전진한다.");
    }

    void backward() {
        System.out.println(this.model + " 후진한다.");
    }

    void turn() {
        System.out.println(this.model + " 회전한다");
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car [companyName = " + companyName + ", model = " + model + ", color = " + color + "maxSpeed = "
                + maxSpeed + "]";
    }
}
