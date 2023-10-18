package items;

import character.Human;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;


public abstract class item {
    private final String name;
    protected LinkedList<item> stored = new LinkedList<item>();
    public item(String name){
        this.name = name;
    }
    public item(String name, item[] stored){
        this.name = name;
        this.stored.addAll(java.util.List.of(stored));
    }

    public String getName() {
        return name;
    }
    public void removeItem(item Item){
        this.stored.remove(Item);
    }

    @Override
    public String toString() {
        return "item{" +
                "name='" + name + '\'' +
                ", stored=" + stored +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        item item = (item) o;
        return Objects.equals(name, item.name) && Objects.equals(stored, item.stored);
    }

    @Override
    public int hashCode() {
        return 11*Objects.hash(name, stored);
    }
}
