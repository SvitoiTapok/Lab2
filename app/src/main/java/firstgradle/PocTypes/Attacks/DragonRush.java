package firstgradle.PocTypes.Attacks;
import ru.ifmo.se.pokemon.*;
import java.util.Random;

public class DragonRush extends PhysicalMove {
    public DragonRush(){
        super(Type.DRAGON, 100, 0.75, 10, 1);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Random r = new Random();
        if (r.nextDouble() <= 0.2) {
            Effect.flinch(p);
        }
    }
    @Override
    protected String describe(){
        return "использует Dragon Rush";
    }
}