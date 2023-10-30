package firstgradle.PocTypes.Attacks;
import ru.ifmo.se.pokemon.*;

public class BubbleBeam extends SpecialMove{
    public BubbleBeam(){
        super(Type.WATER, 65, 1, 20, 1);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.1).stat(Stat.SPEED, -1);
        p.addEffect(e);
    }
    @Override
    protected String describe(){

        return "использует Bubble Beam";

    }
}