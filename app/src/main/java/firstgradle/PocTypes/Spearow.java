package firstgradle.PocTypes;
import ru.ifmo.se.pokemon.*;
import firstgradle.PocTypes.Attacks.*;

public class Spearow extends Pokemon{
        public Spearow(String name, int level){
            super(name, level);
            this.setStats(40,60,30,31,31,70);
            this.addMove(new Facade());
            this.addMove(new Peck());
            this.addMove(new WorkUp());
            this.setType(Type.valueOf("NORMAL"), Type.valueOf("FLYING"));
        }
}

