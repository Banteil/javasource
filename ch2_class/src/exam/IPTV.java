package exam;

public class IPTV extends ColorTV {
    private String ip;

    public IPTV(int size) {
        super(size);
    }

    public IPTV(int size, int color) {
        super(size, color);
    }

    public IPTV(int size, int color, String ip) {
        super(size, color);
        this.ip = ip;
    }

    protected String getIP() {
        return this.ip;
    }

    @Override
    public void printProperty() {
        System.out.printf("나의 IPTV는 %s 주소의 %d인치 %d컬러\n", getIP(), getSize(), getColor());
    }
}
