package inheritance;

public class ChildEx {
    public static void main(String[] args) {
        Parent parent = new Parent(5);
        System.out.println("parent " + parent);

        Child child = new Child();
        Child2 child2 = new Child2();

        // System.out.println(parent.age); // 5
        System.out.println("child age " + child.age); // 15
        child.play();
        child.list(); // 자식클래스

        System.out.println("child2 " + child2.age); // 0
        child2.list(); // 부모클래스

        System.out.println("name " + child.name);
        System.out.println("name " + child.name.length());

    }
}
