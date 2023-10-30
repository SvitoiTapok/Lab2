package firstgradle.PocTypes;
import ru.ifmo.se.pokemon.*;
import firstgradle.PocTypes.Attacks.*;

public class Ludicolo extends Pokemon{
    public Ludicolo(String name, int level){
        super(name, level);
        this.setStats(80,70,70,90,100,70);
        this.addMove(new SwordDance());
        this.addMove(new Swagger());
        this.addMove(new BubbleBeam());
        this.addMove(new Growl());
        this.setType(Type.valueOf("WATER"), Type.valueOf("GRASS"));

    }
}
