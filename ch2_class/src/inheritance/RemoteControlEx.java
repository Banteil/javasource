package inheritance;

public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.setMute(true);
        rc.setVolume(15);

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.setMute(true);
        rc.setVolume(15);

        rc = new RemoteControl() {

            @Override
            public void turnOn() {
                System.out.println("기기 전원을 켬");
            }

            @Override
            public void turnOff() {
                System.out.println("기기 전원을 끔");
            }

            @Override
            public void setVolume(int volume) {
                System.out.println("이 기기는 볼륨이 없음");
            }
        };

        rc.turnOn();
        rc.setVolume(5);
        rc.setMute(true);
        rc.setVolume(15);
    }
}
