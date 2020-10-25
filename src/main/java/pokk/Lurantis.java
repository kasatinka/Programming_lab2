package pokk;
import ru.ifmo.se.pokemon.*;

public class Lurantis extends Fomantis {
    public Lurantis (String name,int level){
        super(name,level);
        setStats(70,105,90,80,90,45);
        setType(Type.GRASS);
        setMove(new SweetScent(), new PoisonJab(), new Facade(), new LowSweep());

    }
}
