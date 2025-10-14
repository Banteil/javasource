package shop;

public class TV extends Product {
    private String resolution;

    public TV() {

    }

    public TV(String name, int price, String resolution) {
        super(name, price);
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public void printExtra() {
        System.out.printf("해상도 정보 : %s\n", this.resolution);
    }

    @Override
    public void printDetail() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printDetail'");
    }
}
