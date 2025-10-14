package inheritance;

// 오버로딩 : 생성자 오버로딩, 메서드 오버로딩
//            하나의 클래스에 동일한 이름으로 생성자, 메서드가 여러개 존재
// 오버라이딩 : 상속에서 자식 클래스가 부모 클래스 메서드 재정의

public class CDPlayer extends Player {
    int currentTrack;

    @Override
    void play(int pos) {
        System.out.println("CD Play");
    }

    @Override
    void stop() {
        System.out.println("CD Stop");
    }

    void nextTrack() {
        currentTrack++;
    }

    void prevTrack() {
        if (currentTrack > 1) {
            currentTrack--;
        }
    }
}
