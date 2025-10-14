package inheritance;

public class Fighter implements IFightable {

    @Override
    public void move(int x, int y) {
        System.out.println("move");
    }

    @Override
    public void attack() {
        System.out.println("attack");
    }

}
