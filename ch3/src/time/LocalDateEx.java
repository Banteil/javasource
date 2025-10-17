package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx {
    public static void main(String[] args) {
        // 자바에서 날짜, 시간 다루기
        // java.util.Date
        // java.util.Calendar
        // (예전꺼)

        // java.time.LocalDate : 날짜
        // java.time.LocalTime : 시간
        // java.time.LocalDateTime : 둘다

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();

        System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초\n", year, month, day, hour, minute, second);

        // 윤년, 평년
        System.out.println("윤년? " + date.isLeapYear());

        // 특정 날짜 지정
        LocalDate date2 = LocalDate.of(2024, 1, 1);
        // 날짜 시간 조작
        LocalDateTime target = dateTime.plusYears(1).minusMonths(2).plusDays(3).plusHours(4).plusMinutes(5)
                .plusSeconds(6);
        System.out.println(target);

        // 날짜와 시간 비교
        LocalDateTime startDate = LocalDateTime.of(2023, 1, 1, 9, 0, 0);
        LocalDateTime endDate = LocalDateTime.of(2024, 3, 1, 9, 0, 0);

        if (startDate.isBefore(endDate)) {
            System.out.println("진행중");
        } else if (startDate.isEqual(endDate)) {
            System.out.println("오늘 마감");
        } else if (startDate.isAfter(endDate)) {
            System.out.println("종료");
        }
    }
}
