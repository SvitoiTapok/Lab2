package firstgradle.PocTypes.Attacks;
import ru.ifmo.se.pokemon.*;

public class SwordDance extends StatusMove{
    public SwordDance(){
        super(Type.valueOf("NORMAL"),0,1,20,1);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.valueOf("ATTACK"), 2);
    }
    protected String describe(){

        return "использует Sword Dance";

    }
}