package HW_7.Task1;

import java.util.ArrayList;
import java.util.List;

public class Warehouse<T> {
    private List<T> items;

    public Warehouse() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public int getItemCount() {
        return items.size();
    }

    public List<T> retrieveAll() {
        List<T> temp = new ArrayList<>(items);
        items.clear();
        return temp;
    }

    public List<T> viewItems() {
        return new ArrayList<>(items);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void clear() {
        items.clear();
    }
}
