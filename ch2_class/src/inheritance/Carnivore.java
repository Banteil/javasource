package inheritance;

// 육식동물
public class Carnivore extends Animal {

    String name;

    public Carnivore() {
        // super();
        System.out.println("Carnivore 생성자");
    }

    @Override
    public void eat() {
        System.out.println("고기를 먹는다");
    }

    public void print() {
        System.out.println(name + " 육식동물");
    }

}
