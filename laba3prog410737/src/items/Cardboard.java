package items;

public class Cardboard extends item implements Container {
    protected boolean opened;
    public Cardboard(String name, item[] stored, boolean opened){
        super(name,stored);
        this.opened = opened;
    }
    public void setPositionToClosed(boolean bool){
        this.opened = bool;
    }
    public void emptied(){
        System.out.println("из "+this.getName()+'a');
    }
}
