package util;

import java.util.ArrayList;

public class Box3<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int idx) {
        return list.get(idx);
    }

    int size() {
        return list.size();
    }

    public ArrayList<T> getList() {
        return list;
    }

}
