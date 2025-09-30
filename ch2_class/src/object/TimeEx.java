package object;

public class TimeEx {
    public static void main(String[] args) {
        Time time = new Time();
        time.setTime(12, 30, 20);
        time.printTime();
        time.setHour(30);
        time.printTime();
    }
}
