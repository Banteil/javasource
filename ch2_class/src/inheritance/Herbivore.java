package inheritance;

// 채식동물
public class Herbivore extends Animal {
    public Herbivore() {
        System.out.println("Herbivore 생성자");
    }

    @Override
    public void eat() {
        System.out.println("풀을 먹는다");
    }
}
