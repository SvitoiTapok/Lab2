package firstgradle.PocTypes;
import ru.ifmo.se.pokemon.*;
import firstgradle.PocTypes.Attacks.*;

public class Lugia extends Pokemon{
    public Lugia(String name, int level){
        super(name, level);
        this.setStats(106,90,130,90,154,110);
        this.addMove(new Facade());
        this.addMove(new Swagger());
        this.addMove(new DoubleTeam());
        this.addMove(new DragonRush());
        this.setType(Type.valueOf("PSYCHIC"), Type.valueOf("FLYING"));
    }
}