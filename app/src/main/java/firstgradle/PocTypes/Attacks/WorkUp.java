package firstgradle.PocTypes.Attacks;
import ru.ifmo.se.pokemon.*;

public class WorkUp extends StatusMove{
    public WorkUp(){
        super(Type.valueOf("NORMAL"), 0, 1, 30,1);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.valueOf("ATTACK"), 1);
        p.setMod(Stat.valueOf("SPECIAL_ATTACK"), 1);
    }
    protected String describe(){

        return "использует Work Up";

    }
}