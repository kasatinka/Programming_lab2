package pokk;

import ru.ifmo.se.pokemon.*;
//done
class HydroPump extends SpecialMove{
    protected HydroPump(){
        super(Type.WATER, 110, 80);
    }
    @Override
    protected String describe(){
        return "поливает";
    }
}

//done
class Rest extends StatusMove {
    protected Rest(){
        super(Type.PSYCHIC,0,0);
    }
    @Override
    protected String describe(){
        return "спит";
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().turns(2).condition(Status.SLEEP));
        p.setMod(Stat.HP,(int)(p.getHP() - p.getStat(Stat.HP)));

    }
}
//done
class StoneEdge extends PhysicalMove{
    protected StoneEdge(){
        super(Type.ROCK,100,80);
    }

    @Override
    protected double calcCriticalHit(Pokemon p1, Pokemon p2) {
        p1.addEffect(new Effect().turns(1).stat(Stat.SPEED,(int)p1.getStat(Stat.SPEED)*3));
        return super.calcCriticalHit(p1,p2);
    }
    @Override
    protected String describe(){ return "кидает острый камешек"; }
}

class RockSlide extends PhysicalMove{
    protected RockSlide(){
        super(Type.ROCK,75,90);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if(Math.random() < 0.3)
            Effect.flinch(p);

    }
    @Override
    protected String describe(){ return "заехал камнем"; }
}

class Facade extends PhysicalMove{
    protected Facade(){
        super(Type.NORMAL,70,100);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        if(p.getCondition() == Status.BURN || p.getCondition() == Status.PARALYZE || p.getCondition() == Status.POISON)
            p.addEffect(new Effect().stat(Stat.ATTACK, (int)p.getStat(Stat.ATTACK)*2));

    }
    @Override
    protected String describe(){ return "в ярости"; }
}

class SweetScent extends StatusMove {
    protected SweetScent() {
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.EVASION,-1);
    }
    @Override
    protected String describe(){ return "брызнулся аксом"; }

}

class PoisonJab extends PhysicalMove{
    protected PoisonJab(){
        super(Type.POISON,80,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if(!(p.hasType(Type.POISON) || p.hasType(Type.STEEL)))
            p.addEffect(new Effect().condition(Status.POISON).chance(0.3d));
    }
    @Override
    protected String describe(){ return "распыляет фосфор"; }

}

class LowSweep extends PhysicalMove{
    protected LowSweep(){
        super(Type.FIGHTING,65,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPEED,-1);
    }
    @Override
    protected String describe(){ return "делает подкат"; }
}

class ChargeBeam extends SpecialMove{
    protected ChargeBeam(){
        super(Type.ELECTRIC,50,90);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK,1);
    }
    @Override
    protected String describe(){ return "светит лучом"; }
}

class ThunderWave extends StatusMove{
    protected ThunderWave(){
        super(Type.ELECTRIC,0,90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect();
        e.condition(Status.PARALYZE);
        if (!p.hasType(Type.ELECTRIC)) {
            p.addEffect(e);
        }

    }
    @Override
    protected String describe(){ return "подул"; }
}

class Spark extends PhysicalMove{
    protected Spark(){
        super(Type.ELECTRIC,65,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (!java.util.Arrays.asList(p.getTypes()).contains(Type.ELECTRIC)) {
            Effect.paralyze(p);
        }

    }
    @Override
    protected String describe(){ return "закоротился"; }
}