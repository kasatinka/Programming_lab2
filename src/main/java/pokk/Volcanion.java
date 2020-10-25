package pokk;
import ru.ifmo.se.pokemon.*;

public class Volcanion extends Pokemon {
    public Volcanion (String name,int level){
        super(name,level);
        setStats(80,110,120,130,90,70);
        setType(Type.FIRE);
        setMove(new HydroPump(), new Rest(), new StoneEdge(), new RockSlide());

    }

}
