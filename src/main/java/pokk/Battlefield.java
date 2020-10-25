package pokk;
import ru.ifmo.se.pokemon.*;

public class Battlefield extends Pokemon {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Volcanion("Homer",3));
        b.addFoe(new Eelektross("Lisa",3));
        b.addAlly(new Eelektrik("Marge",3));
        b.addFoe(new Tynamo("Bart",2));
        b.addAlly(new Lurantis("Maggie",4));
        b.addFoe(new Fomantis("Santa's Little Helper",2));
        b.go();
    }
}
