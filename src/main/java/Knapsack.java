import java.util.ArrayList;

import java.util.ListIterator;

public class Knapsack {

    public Knapsack() {
    }
    public int maximumValue(int capacity, ArrayList<Item> items) {
        int n = items.size();
        ListIterator<Item> iterator = items.listIterator(n);

        if (n <= 0) {
            return 0;
        } else if (!(iterator.hasNext()) && (items.get(n-1).getW() > capacity)) {
            items.remove(n-1);
            return maximumValue(capacity, items);
        } else {
            ArrayList<Item> itemsLessLast = new ArrayList<Item>(items.subList(0,n-1));
            return Math.max(maximumValue(capacity, itemsLessLast), items.get(n-1).getV() + maximumValue((capacity-items.get(n-1).getW()), itemsLessLast));
        }
    }
}
class Item {
    private int w;
    private int v;

    public Item(int w, int v) {
        this.w = w;
        this.v = v;
    }

    public int getW() {
        return w;
    }

    public int getV() {
        return v;
    }
}