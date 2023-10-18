package character;

import items.item;

public class Karlson extends Human implements HaveReason {
    boolean seenThatThing;
    public Karlson(String name, int tilBday, boolean seenPistol) {
        super(name, tilBday);
        this.seenThatThing = seenPistol;
    }
    public void getSeen(item Item){
        if (seenThatThing){
            System.out.println(this.getName() + " уже успел обнаружить " + Item.getName());
        }
    }
    public void setBday(int when){
        this.tilBday = when;
    }

    public void why(Human human) {
        if (super.getLiked().length != 0) {
            System.out.println("так как " + human.getName() +"у" + " он понравился" + ", он");
        }
    }
}
