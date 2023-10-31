package firstgradle.PocTypes.Attacks;
import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove{
    public DoubleTeam(){
        super(Type.NORMAL,0,100,15,1);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION, 1);
    }
    @Override
    protected String describe() {

        return "использует DoubleTeam";
    }
}