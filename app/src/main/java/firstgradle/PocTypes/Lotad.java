package firstgradle.PocTypes;
import ru.ifmo.se.pokemon.*;
import firstgradle.PocTypes.Attacks.*;

public class Lotad extends Pokemon{
    public Lotad(String name, int level){
        super(name, level);
        this.setStats(40,30,30,40,50,30);
        this.addMove(new SwordDance());
        this.addMove(new Swagger());
        this.setType(Type.valueOf("WATER"), Type.valueOf("GRASS"));

    }
}
//class BubbleBeam extends SpecialMove{
//    BubbleBeam(){
//        super(Type.valueOf("WATER"), 65, 0.2, 20, 1);
//    }
//
//}


