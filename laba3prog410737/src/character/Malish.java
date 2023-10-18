package character;

public class Malish extends Human implements HaveReason{
    public Malish (String name){
        super(name);
    }
    public void showPistol(Karlson Karlson){
         if (Karlson.seenThatThing){
             System.out.println("решил не показывать его");
             System.out.println("но это бессмысленно и некрасиво, как думает " + super.getName());
         }
    }
    public void why(Human human){
        System.out.println("По довольно очевидной причине "+human.getName());
    }
}
