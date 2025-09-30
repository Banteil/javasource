package object;

public class Time {
    private int hour, minute, second;
    private final int MAX_HOUR = 23;
    private final int MAX_MINUTE_OR_SECOND = 59;
    // 시분초는 모두 0보다 크거나 같아야 함
    // 시의 범위는 0~23, 분 초의 범위는 0~59

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour > MAX_HOUR ? MAX_HOUR : hour < 0 ? 0 : hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute > MAX_MINUTE_OR_SECOND ? MAX_MINUTE_OR_SECOND : minute < 0 ? 0 : minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second > MAX_MINUTE_OR_SECOND ? MAX_MINUTE_OR_SECOND : second < 0 ? 0 : second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour > MAX_HOUR ? MAX_HOUR : hour < 0 ? 0 : hour;
        this.minute = minute > MAX_MINUTE_OR_SECOND ? MAX_MINUTE_OR_SECOND : minute < 0 ? 0 : minute;
        this.second = second > MAX_MINUTE_OR_SECOND ? MAX_MINUTE_OR_SECOND : second < 0 ? 0 : second;
    }

    public void printTime() {
        System.out.printf("%d:%d:%d\n", this.hour, this.minute, this.second);
    }

    @Override
    public String toString() {
        return "Time [hour = " + this.hour + ", minute = " + this.minute + ", second = " + this.second + "]";
    }
}
