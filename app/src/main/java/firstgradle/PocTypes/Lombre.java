package firstgradle.PocTypes;
import ru.ifmo.se.pokemon.*;
import firstgradle.PocTypes.Attacks.*;

public class Lombre extends Pokemon{
    public Lombre(String name, int level){
        super(name, level);
        this.setStats(60,50,50,60,70,50);
        this.addMove(new SwordDance());
        this.addMove(new Swagger());
        this.addMove(new BubbleBeam());
        this.setType(Type.valueOf("WATER"), Type.valueOf("GRASS"));

    }
}

