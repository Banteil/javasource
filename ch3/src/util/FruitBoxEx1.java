package util;

//Generics : 다양한 타입의 객체들을 다루는 메서드나 컬렉션
//ex Box2<T>
//  - T : Type variable - 타입 변수 혹은 타입 매개변수
//  - Box2 : 원시 타입
//E : Element
//와일드카드
//<? extend T> : T와 그 자손들만 가능
//<? super T> : T와 그 조상들만 가능
//<?> : 제한없음

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box3<Fruit> fruitBox = new Box3<>();
        Box3<Apple> appleBox = new Box3<>();
        Box3<Grape> grapeBox = new Box3<>();
        Box3<Toy> toyBox = new Box3<>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        // fruitBox.add(new Toy());

        appleBox.add(new Apple());
        grapeBox.add(new Grape());
        toyBox.add(new Toy());

        Juicer.makJuice(fruitBox);
        Juicer.makJuice(grapeBox);
        Juicer.makJuice(appleBox);
        // Juicer.makJuice(toyBox);
    }
}
