package firstgradle.PocTypes;
import ru.ifmo.se.pokemon.*;
import firstgradle.PocTypes.Attacks.*;

public class Fearow extends Pokemon{
    public Fearow(String name, int level){
        super(name, level);
        this.setStats(65,90,65,61,61,100);
        this.addMove(new Facade());
        this.addMove(new Peck());
        this.addMove(new WorkUp());
        this.setType(Type.valueOf("NORMAL"), Type.valueOf("FLYING"));
    }
}