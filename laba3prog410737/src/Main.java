import character.*;
import items.*;

public class Main {
    public static void main(String[] args){
        Karlson karlson = new Karlson("Карлсон", 365, true);
        Malish malish = new Malish("Малыш");

        Pistoletik pistoletik = new Pistoletik("пистолетик");
        Box box = new Box("коробок", new item[]{pistoletik});
        Cardboard cardboard = new Cardboard("ящик", new item[]{box},true);

        malish.why(malish);
        malish.showPistol(karlson);
        karlson.getSeen(pistoletik);
        karlson.makeSound(Sound.Rumble);
        cardboard.setPositionToClosed(false);
        cardboard.setPositionToClosed(true);
        karlson.setLiked(pistoletik);
        karlson.setBday(0);
        karlson.why(karlson);
        karlson.checkForParty();
        malish.makeSound(Sound.Gasp_deeply);
        cardboard.setPositionToClosed(true);
        malish.addItem(box);
        box.emptied();
        cardboard.removeItem(box);
        cardboard.emptied();
        cardboard.setPositionToClosed(true);
//TODO:
// сделать иавен
    }
}