package inheritance;

public class CaptionTV extends TV {

    boolean caption;

    public CaptionTV(int size, int channel, boolean power, String color) {
        super(size, channel, power, color);
    }

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}
