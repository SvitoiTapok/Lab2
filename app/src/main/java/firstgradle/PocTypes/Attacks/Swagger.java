package firstgradle.PocTypes.Attacks;
import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove{
    public Swagger(){
        super(Type.valueOf("NORMAL"),0,85,15,1);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 2);
        p.confuse();
    }
    protected String describe(){

        return "использует Swagger";

    }
}
