package pokk;
import ru.ifmo.se.pokemon.*;


public class Eelektross extends Eelektrik {
    public Eelektross(String name, int level){
        super(name,level);
        setStats(85,115,80,105,80,50);
        setType(Type.ELECTRIC);
        setMove(new ChargeBeam(), new ThunderWave(), new Spark(), new Rest());

    }
}
