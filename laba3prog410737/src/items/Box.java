package items;

public class Box extends item implements Container {
    public Box(String name, item[] stored){
        super(name,stored);
    }

    public void emptied(){
        System.out.println("достал " + this.getName());
    }
}
