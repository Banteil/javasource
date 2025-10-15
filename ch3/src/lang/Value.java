package lang;

public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Value) {
            Value v = (Value) obj;
            return this.value == v.value;
        }
        return false;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
