public class Wizard extends GameCharacter {
    public Wizard(){
        attackStrategy = new CastSpell();
        defenseStrategy = new CreateMagicBarrier();
    }
}
