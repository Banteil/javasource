package inheritance;

public class SamsungTV extends Product {

    public SamsungTV(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "SamsungTV";
    }

}
