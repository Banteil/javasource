package shop;

public class CellPhone extends Product {
    private String carrier;

    public CellPhone() {

    }

    public CellPhone(String name, int price, String carrier) {
        super(name, price);
        this.carrier = carrier;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    @Override
    public void printExtra() {
        System.out.printf("통신사 정보 : %s\n", this.carrier);
    }

    @Override
    public void printDetail() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printDetail'");
    }
}
