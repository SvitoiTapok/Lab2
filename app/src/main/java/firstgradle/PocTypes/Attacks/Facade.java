package firstgradle.PocTypes.Attacks;
import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.valueOf("NORMAL"), 70, 1, 20, 1);
    }
    @Override
    protected String describe(){

        return "использует Facade";

    }
}

//   @Override
//   protected void applySelfEffects(Pokemon p){
//       System.out.println(p.getStat(Stat.valueOf("ATTACK")));
//       System.out.println(p.getStat(Stat.valueOf("DEFENSE")));
//       System.out.println(p.getStat(Stat.valueOf("HP")));
//   }