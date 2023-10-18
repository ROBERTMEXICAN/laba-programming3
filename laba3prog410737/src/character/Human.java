package character;
import items.item;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public abstract class Human {
    protected String name;
    protected int tilBday;
    protected LinkedList<item> items = new LinkedList<item>();
    protected LinkedList<item> liked = new LinkedList<item>();
    public Human(String name, int til_bday){
        this.name = name;
    }
    public Human(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void addItem(item thing){
        items.add(thing);
    }
    public int getTilBday(){
        return tilBday; }
    public void checkForParty(){
        if (this.getTilBday() == 0){
            System.out.println("сегодня устраивает праздник");
        }
    }
    public Object[] getItems(){
        return items.toArray();
    }

    public void showItemTo(item it, Human human){
        System.out.println();
    }
    public Object[] getLiked(){
        return liked.toArray();
    }
    public void setLiked(item it){
        liked.add(it);
    }
    public void makeSound(Sound sound){
        System.out.println(this.getName() + " " + sound.getSound());
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", tilBday=" + tilBday +
                ", items=" + items +
                ", liked=" + liked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return tilBday == human.tilBday && Objects.equals(name, human.name) && Objects.equals(items, human.items) && Objects.equals(liked, human.liked);
    }

    @Override
    public int hashCode() {
        return 31*Objects.hash(name, tilBday, items, liked);
    }
}
