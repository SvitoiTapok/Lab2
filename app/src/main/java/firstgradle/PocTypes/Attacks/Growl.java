package firstgradle.PocTypes.Attacks;
import ru.ifmo.se.pokemon.*;

public class Growl extends StatusMove{
    public Growl(){
        super(Type.NORMAL,0,100,30,1);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, -1);
    }
    @Override
    protected String describe(){

        return "использует Growl";

    }
}