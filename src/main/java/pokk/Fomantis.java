package pokk;
import ru.ifmo.se.pokemon.*;

public class Fomantis extends Pokemon {
    public Fomantis (String name,int level){
        super(name,level);
        setStats(40,55,35,50,35,35);
        setType(Type.GRASS);
        setMove(new Facade(), new SweetScent(), new PoisonJab());
    }
}
