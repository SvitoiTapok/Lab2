package firstgradle.PocTypes.Attacks;
import ru.ifmo.se.pokemon.*;

public class Peck extends PhysicalMove{
    public Peck(){
        super(Type.valueOf("FLYING"), 35,1,35,1);
    }
    protected String describe(){

        return "использует Peck";

    }
}
