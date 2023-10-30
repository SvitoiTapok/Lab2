package firstgradle.PocTypes.Attacks;
import ru.ifmo.se.pokemon.*;

public class DrillRun extends PhysicalMove {
    public DrillRun() {
        super(Type.GROUND, 80, 0.95, 10, 1);}
    @Override
    protected String describe(){

        return "использует Drill Run";

    }
}