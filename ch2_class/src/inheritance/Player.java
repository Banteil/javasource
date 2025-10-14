package inheritance;

public abstract class Player {
    boolean pause;
    int currentPos;
    final int num = 0;

    public Player() {
    }

    public Player(boolean pause, int currentPos) {
        this.pause = pause;
        this.currentPos = currentPos;
    }

    abstract void play(int pos);

    abstract void stop();

    void pause() {
        if (pause) {
            pause = false;
            play(currentPos);
        } else {
            pause = true;
            stop();
        }
    }
}
